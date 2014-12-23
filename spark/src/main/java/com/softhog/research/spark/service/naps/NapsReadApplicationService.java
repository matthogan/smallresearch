/**
 * 
 */
package com.softhog.research.spark.service.naps;

import javax.annotation.Resource;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Default;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.persistence.SynchronizationType;
import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.NotSupportedException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.UserTransaction;

import com.softhog.research.spark.KVException;
import com.softhog.research.spark.entity.naps.ApplApplication;
import com.softhog.research.spark.service.Service;

/**
 * @author 
 *
 */
@Default
@RequestScoped
public class NapsReadApplicationService implements Service
{
    /**
     * UNSYNCHRONIZED - manually update db rather than auto
     */
    @PersistenceContext ( unitName = "KG", type = PersistenceContextType.TRANSACTION, synchronization = SynchronizationType.UNSYNCHRONIZED)
    private EntityManager em;

    // @PersistenceUnit //( name = "KG")
    // private EntityManagerFactory emf;

    /** Tx */
    @Resource
    private UserTransaction utx;

    /**
     * @see com.softhog.research.spark.service.Service#process(java.lang.Object)
     */
    @Override
    public Object process( Object input )
    {
        // still have to cast explicitly, a java weakness with generics
        // & lamba
        String applicationNumber = (String) input;

        try
        {
            // EntityManager em = emf.createEntityManager( SynchronizationType.UNSYNCHRONIZED );

            utx.begin();

            ApplApplication appl = em.find( ApplApplication.class, applicationNumber );

            utx.commit();

            return appl;
        }
        catch( SecurityException | IllegalStateException | NotSupportedException | SystemException | RollbackException
                        | HeuristicMixedException | HeuristicRollbackException e )
        {
            try
            {
                utx.rollback();
            }
            catch( IllegalStateException | SecurityException | SystemException e1 )
            {
                throw new KVException( "NRAS_RB_ERR", e, e.getMessage() );
            }

            throw new KVException( "NRAS_ERR", e, e.getMessage() );
        }
    }
}
