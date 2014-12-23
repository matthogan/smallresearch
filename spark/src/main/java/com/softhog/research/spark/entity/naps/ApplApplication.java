/**
 * 
 */
package com.softhog.research.spark.entity.naps;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Models the APPL_APPLICATION tuple
 * 
 * @author 
 *
 */
@Entity
@Table ( name = "APPL_APPLICATION")
public class ApplApplication
{
    @Id
    @Column ( name = "APPLICATION_NUMBER", columnDefinition = "CHAR(12)")
    private String applicationNumber;

    @Column ( name = "APPLICATION_TYPE", columnDefinition = "CHAR(2)")
    private String applicationType;

    @Column ( name = "ENTRY_DATE", columnDefinition = "DATE")
    private String entryDate;

    @Column ( name = "ORIGINATING_NSC", columnDefinition = "CHAR(6)")
    private String originatingNsc;

    @Column ( name = "PROCESSING_NSC", columnDefinition = "CHAR(6)")
    private String processingNsc;

    @Column ( name = "BOOKING_NSC", columnDefinition = "CHAR(6)")
    private String bookingNsc;

    @Column ( name = "BOOKING_ARCB", columnDefinition = "CHAR(8)")
    private String bookingArcb;

    @Column ( name = "SOURCE", columnDefinition = "CHAR(30)")
    private String source;

    @Column ( name = "LEAD_STAFF_ID", columnDefinition = "CHAR(5)")
    private String leadStaffId;

    @Column ( name = "SALES_STAFF_ID", columnDefinition = "CHAR(5)")
    private String salesStaffId;

    @Column ( name = "TOTAL_CREDIT_SCORE", columnDefinition = "CHAR(3)")
    private String totalCreditScore;

    @Column ( name = "OPERATING_CURRENCY", columnDefinition = "CHAR(1)")
    private String operatingCurrency;

    @Column ( name = "JOINT_APPLICATION", columnDefinition = "CHAR(1)")
    private String jointApplication;

    @Column ( name = "CURRENT_USER", columnDefinition = "CHAR(5)")
    private String currentUser;

    @Column ( name = "PRODS_DECISIONED", columnDefinition = "CHAR(1)")
    private String prodsDecisioned;

    @Column ( name = "CURRENT_USED_TERM", columnDefinition = "CHAR(10)")
    private String currentUsedTerm;

    @Column ( name = "CURRENT_EDIT_MODE", columnDefinition = "CHAR(1)")
    private String currentEditMode;

    @Column ( name = "SCORE_CARD_MODEL", columnDefinition = "CHAR(10)")
    private String scoreCardModel;

    @Column ( name = "CANCEL_REASON_CD", columnDefinition = "CHAR(2)")
    private String cancelReasonCd;

    @Column ( name = "TBU_INDICATOR", columnDefinition = "CHAR(1)")
    private String tbuIndicator;

    @Column ( name = "LETTER_SIGN_NAME", columnDefinition = "CHAR(25)")
    private String letterSignName;

    @Column ( name = "LETTER_SIGN_TITLE", columnDefinition = "CHAR(20)")
    private String letterSignTitle;

    @Column ( name = "VERIFIED_IND", columnDefinition = "CHAR(1)")
    private String verifiedInd;

    @Column ( name = "VERIFIED_BY_STAFF", columnDefinition = "CHAR(5)")
    private String verifiedByStaff;

    @Column ( name = "CRED_A_SIGNED_IND", columnDefinition = "CHAR(1)")
    private String credASignedInd;

    @Column ( name = "CRED_A_SIGN_STAFF", columnDefinition = "CHAR(5)")
    private String credASignStaff;

    @Column ( name = "REQ_CONFIRMATION", columnDefinition = "CHAR(1)")
    private String reqConfirmation;

    @Column ( name = "CONFIRMED_IND", columnDefinition = "CHAR(1)")
    private String confirmedInd;

    @Column ( name = "SIGN_AT_BRANCH_REQ", columnDefinition = "CHAR(1)")
    private String signAtBranchReq;

    @Column ( name = "REPAYMENT_AC_NSC", columnDefinition = "CHAR(6)")
    private String repaymentAcNsc;

    @Column ( name = "REPAYMENT_AC_NO", columnDefinition = "CHAR(8)")
    private String repaymentAcNo;

    @Column ( name = "REPAYMENT_METHOD", columnDefinition = "CHAR(1)")
    private String repaymentMethod;

    @Column ( name = "DRAWDOWN_AC_NSC", columnDefinition = "CHAR(6)")
    private String drawdownAcNsc;

    @Column ( name = "DRAWDOWN_AC_NO", columnDefinition = "CHAR(8)")
    private String drawdownAcNo;

    @Column ( name = "DRAWDOWN_METHOD", columnDefinition = "CHAR(1)")
    private String drawdownMethod;

    @Column ( name = "CREATED_STAFF_ID", columnDefinition = "CHAR(5)")
    private String createdStaffId;

    @Column ( name = "LAST_UPDATE_STAFF", columnDefinition = "CHAR(5)")
    private String lastUpdateStaff;

    @Column ( name = "LATEST_LIFECYCLE", columnDefinition = "CHAR(2)")
    private String latestLifecycle;

    @Column ( name = "SECURITY_IND", columnDefinition = "CHAR(1)")
    private String securityInd;

    @Column ( name = "SOURCE_APPL_NUMBER", columnDefinition = "CHAR(12)")
    private String sourceApplNumber;

    @Column ( name = "VALUATION_RCVD_FLG", columnDefinition = "CHAR(1)")
    private String valuationRcvdFlg;

    @Column ( name = "COND_OF_SANCT_FLG", columnDefinition = "CHAR(1)")
    private String condOfSanctFlg;

    @Column ( name = "CONFIRMED_STAFF_ID", columnDefinition = "CHAR(5)")
    private String confirmedStaffId;

    @Column ( name = "SECURITY_EFCTV_FLG", columnDefinition = "CHAR(1)")
    private String securityEfctvFlg;

    @Column ( name = "PRV_TRMS_CONDS_FLG", columnDefinition = "CHAR(1)")
    private String prvTrmsCondsFlg;

    @Column ( name = "CGRD_UPD_12MTH_FLG", columnDefinition = "CHAR(1)")
    private String cgrdUpd_12mthFlg;

    @Column ( name = "PP_DECLAR_SIGN_IND", columnDefinition = "CHAR(1)")
    private String ppDeclarSignInd;

    @Column ( name = "IE_STATUS", columnDefinition = "CHAR(1)")
    private String ieStatus;

    @Column ( name = "DEBTOR_BIC", columnDefinition = "CHAR(11)")
    private String debtorBic;

    @Column ( name = "DEBTOR_IBAN", columnDefinition = "CHAR(35)")
    private String debtorIban;

    @Column ( name = "DEBTOR_NAME", columnDefinition = "CHAR(35)")
    private String debtorName;

    @Column ( name = "POLICY_EXCEPTIONS", columnDefinition = "CHAR(1)")
    private String policyExceptions;

    @Column ( name = "ONLINE_REFER_FLAG", columnDefinition = "CHAR(1)")
    private String onlineReferFlag;

    /**
     * 
     */
    public ApplApplication()
    {
    }

    /**
     * @return
     */
    public String getApplicationNumber()
    {
        return applicationNumber;
    }

    /**
     * @param applicationNumber
     */
    public void setApplicationNumber( String applicationNumber )
    {
        this.applicationNumber = applicationNumber;
    }

    /**
     * @return
     */
    public String getApplicationType()
    {
        return applicationType;
    }

    /**
     * @param applicationType
     */
    public void setApplicationType( String applicationType )
    {
        this.applicationType = applicationType;
    }

    /**
     * @return the entryDate
     */
    public String getEntryDate()
    {
        return entryDate;
    }

    /**
     * @param entryDate the entryDate to set
     */
    public void setEntryDate( String entryDate )
    {
        this.entryDate = entryDate;
    }

    /**
     * @return the originatingNsc
     */
    public String getOriginatingNsc()
    {
        return originatingNsc;
    }

    /**
     * @param originatingNsc the originatingNsc to set
     */
    public void setOriginatingNsc( String originatingNsc )
    {
        this.originatingNsc = originatingNsc;
    }

    /**
     * @return the processingNsc
     */
    public String getProcessingNsc()
    {
        return processingNsc;
    }

    /**
     * @param processingNsc the processingNsc to set
     */
    public void setProcessingNsc( String processingNsc )
    {
        this.processingNsc = processingNsc;
    }

    /**
     * @return the bookingNsc
     */
    public String getBookingNsc()
    {
        return bookingNsc;
    }

    /**
     * @param bookingNsc the bookingNsc to set
     */
    public void setBookingNsc( String bookingNsc )
    {
        this.bookingNsc = bookingNsc;
    }

    /**
     * @return the bookingArcb
     */
    public String getBookingArcb()
    {
        return bookingArcb;
    }

    /**
     * @param bookingArcb the bookingArcb to set
     */
    public void setBookingArcb( String bookingArcb )
    {
        this.bookingArcb = bookingArcb;
    }

    /**
     * @return the source
     */
    public String getSource()
    {
        return source;
    }

    /**
     * @param source the source to set
     */
    public void setSource( String source )
    {
        this.source = source;
    }

    /**
     * @return the leadStaffId
     */
    public String getLeadStaffId()
    {
        return leadStaffId;
    }

    /**
     * @param leadStaffId the leadStaffId to set
     */
    public void setLeadStaffId( String leadStaffId )
    {
        this.leadStaffId = leadStaffId;
    }

    /**
     * @return the salesStaffId
     */
    public String getSalesStaffId()
    {
        return salesStaffId;
    }

    /**
     * @param salesStaffId the salesStaffId to set
     */
    public void setSalesStaffId( String salesStaffId )
    {
        this.salesStaffId = salesStaffId;
    }

    /**
     * @return the totalCreditScore
     */
    public String getTotalCreditScore()
    {
        return totalCreditScore;
    }

    /**
     * @param totalCreditScore the totalCreditScore to set
     */
    public void setTotalCreditScore( String totalCreditScore )
    {
        this.totalCreditScore = totalCreditScore;
    }

    /**
     * @return the operatingCurrency
     */
    public String getOperatingCurrency()
    {
        return operatingCurrency;
    }

    /**
     * @param operatingCurrency the operatingCurrency to set
     */
    public void setOperatingCurrency( String operatingCurrency )
    {
        this.operatingCurrency = operatingCurrency;
    }

    /**
     * @return the jointApplication
     */
    public String getJointApplication()
    {
        return jointApplication;
    }

    /**
     * @param jointApplication the jointApplication to set
     */
    public void setJointApplication( String jointApplication )
    {
        this.jointApplication = jointApplication;
    }

    /**
     * @return the currentUser
     */
    public String getCurrentUser()
    {
        return currentUser;
    }

    /**
     * @param currentUser the currentUser to set
     */
    public void setCurrentUser( String currentUser )
    {
        this.currentUser = currentUser;
    }

    /**
     * @return the prodsDecisioned
     */
    public String getProdsDecisioned()
    {
        return prodsDecisioned;
    }

    /**
     * @param prodsDecisioned the prodsDecisioned to set
     */
    public void setProdsDecisioned( String prodsDecisioned )
    {
        this.prodsDecisioned = prodsDecisioned;
    }

    /**
     * @return the currentUsedTerm
     */
    public String getCurrentUsedTerm()
    {
        return currentUsedTerm;
    }

    /**
     * @param currentUsedTerm the currentUsedTerm to set
     */
    public void setCurrentUsedTerm( String currentUsedTerm )
    {
        this.currentUsedTerm = currentUsedTerm;
    }

    /**
     * @return the currentEditMode
     */
    public String getCurrentEditMode()
    {
        return currentEditMode;
    }

    /**
     * @param currentEditMode the currentEditMode to set
     */
    public void setCurrentEditMode( String currentEditMode )
    {
        this.currentEditMode = currentEditMode;
    }

    /**
     * @return the scoreCardModel
     */
    public String getScoreCardModel()
    {
        return scoreCardModel;
    }

    /**
     * @param scoreCardModel the scoreCardModel to set
     */
    public void setScoreCardModel( String scoreCardModel )
    {
        this.scoreCardModel = scoreCardModel;
    }

    /**
     * @return the cancelReasonCd
     */
    public String getCancelReasonCd()
    {
        return cancelReasonCd;
    }

    /**
     * @param cancelReasonCd the cancelReasonCd to set
     */
    public void setCancelReasonCd( String cancelReasonCd )
    {
        this.cancelReasonCd = cancelReasonCd;
    }

    /**
     * @return the tbuIndicator
     */
    public String getTbuIndicator()
    {
        return tbuIndicator;
    }

    /**
     * @param tbuIndicator the tbuIndicator to set
     */
    public void setTbuIndicator( String tbuIndicator )
    {
        this.tbuIndicator = tbuIndicator;
    }

    /**
     * @return the letterSignName
     */
    public String getLetterSignName()
    {
        return letterSignName;
    }

    /**
     * @param letterSignName the letterSignName to set
     */
    public void setLetterSignName( String letterSignName )
    {
        this.letterSignName = letterSignName;
    }

    /**
     * @return the letterSignTitle
     */
    public String getLetterSignTitle()
    {
        return letterSignTitle;
    }

    /**
     * @param letterSignTitle the letterSignTitle to set
     */
    public void setLetterSignTitle( String letterSignTitle )
    {
        this.letterSignTitle = letterSignTitle;
    }

    /**
     * @return the verifiedInd
     */
    public String getVerifiedInd()
    {
        return verifiedInd;
    }

    /**
     * @param verifiedInd the verifiedInd to set
     */
    public void setVerifiedInd( String verifiedInd )
    {
        this.verifiedInd = verifiedInd;
    }

    /**
     * @return the verifiedByStaff
     */
    public String getVerifiedByStaff()
    {
        return verifiedByStaff;
    }

    /**
     * @param verifiedByStaff the verifiedByStaff to set
     */
    public void setVerifiedByStaff( String verifiedByStaff )
    {
        this.verifiedByStaff = verifiedByStaff;
    }

    /**
     * @return the credASignedInd
     */
    public String getCredASignedInd()
    {
        return credASignedInd;
    }

    /**
     * @param credASignedInd the credASignedInd to set
     */
    public void setCredASignedInd( String credASignedInd )
    {
        this.credASignedInd = credASignedInd;
    }

    /**
     * @return the credASignStaff
     */
    public String getCredASignStaff()
    {
        return credASignStaff;
    }

    /**
     * @param credASignStaff the credASignStaff to set
     */
    public void setCredASignStaff( String credASignStaff )
    {
        this.credASignStaff = credASignStaff;
    }

    /**
     * @return the reqConfirmation
     */
    public String getReqConfirmation()
    {
        return reqConfirmation;
    }

    /**
     * @param reqConfirmation the reqConfirmation to set
     */
    public void setReqConfirmation( String reqConfirmation )
    {
        this.reqConfirmation = reqConfirmation;
    }

    /**
     * @return the confirmedInd
     */
    public String getConfirmedInd()
    {
        return confirmedInd;
    }

    /**
     * @param confirmedInd the confirmedInd to set
     */
    public void setConfirmedInd( String confirmedInd )
    {
        this.confirmedInd = confirmedInd;
    }

    /**
     * @return the signAtBranchReq
     */
    public String getSignAtBranchReq()
    {
        return signAtBranchReq;
    }

    /**
     * @param signAtBranchReq the signAtBranchReq to set
     */
    public void setSignAtBranchReq( String signAtBranchReq )
    {
        this.signAtBranchReq = signAtBranchReq;
    }

    /**
     * @return the repaymentAcNsc
     */
    public String getRepaymentAcNsc()
    {
        return repaymentAcNsc;
    }

    /**
     * @param repaymentAcNsc the repaymentAcNsc to set
     */
    public void setRepaymentAcNsc( String repaymentAcNsc )
    {
        this.repaymentAcNsc = repaymentAcNsc;
    }

    /**
     * @return the repaymentAcNo
     */
    public String getRepaymentAcNo()
    {
        return repaymentAcNo;
    }

    /**
     * @param repaymentAcNo the repaymentAcNo to set
     */
    public void setRepaymentAcNo( String repaymentAcNo )
    {
        this.repaymentAcNo = repaymentAcNo;
    }

    /**
     * @return the repaymentMethod
     */
    public String getRepaymentMethod()
    {
        return repaymentMethod;
    }

    /**
     * @param repaymentMethod the repaymentMethod to set
     */
    public void setRepaymentMethod( String repaymentMethod )
    {
        this.repaymentMethod = repaymentMethod;
    }

    /**
     * @return the drawdownAcNsc
     */
    public String getDrawdownAcNsc()
    {
        return drawdownAcNsc;
    }

    /**
     * @param drawdownAcNsc the drawdownAcNsc to set
     */
    public void setDrawdownAcNsc( String drawdownAcNsc )
    {
        this.drawdownAcNsc = drawdownAcNsc;
    }

    /**
     * @return the drawdownAcNo
     */
    public String getDrawdownAcNo()
    {
        return drawdownAcNo;
    }

    /**
     * @param drawdownAcNo the drawdownAcNo to set
     */
    public void setDrawdownAcNo( String drawdownAcNo )
    {
        this.drawdownAcNo = drawdownAcNo;
    }

    /**
     * @return the drawdownMethod
     */
    public String getDrawdownMethod()
    {
        return drawdownMethod;
    }

    /**
     * @param drawdownMethod the drawdownMethod to set
     */
    public void setDrawdownMethod( String drawdownMethod )
    {
        this.drawdownMethod = drawdownMethod;
    }

    /**
     * @return the createdStaffId
     */
    public String getCreatedStaffId()
    {
        return createdStaffId;
    }

    /**
     * @param createdStaffId the createdStaffId to set
     */
    public void setCreatedStaffId( String createdStaffId )
    {
        this.createdStaffId = createdStaffId;
    }

    /**
     * @return the lastUpdateStaff
     */
    public String getLastUpdateStaff()
    {
        return lastUpdateStaff;
    }

    /**
     * @param lastUpdateStaff the lastUpdateStaff to set
     */
    public void setLastUpdateStaff( String lastUpdateStaff )
    {
        this.lastUpdateStaff = lastUpdateStaff;
    }

    /**
     * @return the latestLifecycle
     */
    public String getLatestLifecycle()
    {
        return latestLifecycle;
    }

    /**
     * @param latestLifecycle the latestLifecycle to set
     */
    public void setLatestLifecycle( String latestLifecycle )
    {
        this.latestLifecycle = latestLifecycle;
    }

    /**
     * @return the securityInd
     */
    public String getSecurityInd()
    {
        return securityInd;
    }

    /**
     * @param securityInd the securityInd to set
     */
    public void setSecurityInd( String securityInd )
    {
        this.securityInd = securityInd;
    }

    /**
     * @return the sourceApplNumber
     */
    public String getSourceApplNumber()
    {
        return sourceApplNumber;
    }

    /**
     * @param sourceApplNumber the sourceApplNumber to set
     */
    public void setSourceApplNumber( String sourceApplNumber )
    {
        this.sourceApplNumber = sourceApplNumber;
    }

    /**
     * @return the valuationRcvdFlg
     */
    public String getValuationRcvdFlg()
    {
        return valuationRcvdFlg;
    }

    /**
     * @param valuationRcvdFlg the valuationRcvdFlg to set
     */
    public void setValuationRcvdFlg( String valuationRcvdFlg )
    {
        this.valuationRcvdFlg = valuationRcvdFlg;
    }

    /**
     * @return the condOfSanctFlg
     */
    public String getCondOfSanctFlg()
    {
        return condOfSanctFlg;
    }

    /**
     * @param condOfSanctFlg the condOfSanctFlg to set
     */
    public void setCondOfSanctFlg( String condOfSanctFlg )
    {
        this.condOfSanctFlg = condOfSanctFlg;
    }

    /**
     * @return the confirmedStaffId
     */
    public String getConfirmedStaffId()
    {
        return confirmedStaffId;
    }

    /**
     * @param confirmedStaffId the confirmedStaffId to set
     */
    public void setConfirmedStaffId( String confirmedStaffId )
    {
        this.confirmedStaffId = confirmedStaffId;
    }

    /**
     * @return the securityEfctvFlg
     */
    public String getSecurityEfctvFlg()
    {
        return securityEfctvFlg;
    }

    /**
     * @param securityEfctvFlg the securityEfctvFlg to set
     */
    public void setSecurityEfctvFlg( String securityEfctvFlg )
    {
        this.securityEfctvFlg = securityEfctvFlg;
    }

    /**
     * @return the prvTrmsCondsFlg
     */
    public String getPrvTrmsCondsFlg()
    {
        return prvTrmsCondsFlg;
    }

    /**
     * @param prvTrmsCondsFlg the prvTrmsCondsFlg to set
     */
    public void setPrvTrmsCondsFlg( String prvTrmsCondsFlg )
    {
        this.prvTrmsCondsFlg = prvTrmsCondsFlg;
    }

    /**
     * @return the cgrdUpd_12mthFlg
     */
    public String getCgrdUpd_12mthFlg()
    {
        return cgrdUpd_12mthFlg;
    }

    /**
     * @param cgrdUpd_12mthFlg the cgrdUpd_12mthFlg to set
     */
    public void setCgrdUpd_12mthFlg( String cgrdUpd_12mthFlg )
    {
        this.cgrdUpd_12mthFlg = cgrdUpd_12mthFlg;
    }

    /**
     * @return the ppDeclarSignInd
     */
    public String getPpDeclarSignInd()
    {
        return ppDeclarSignInd;
    }

    /**
     * @param ppDeclarSignInd the ppDeclarSignInd to set
     */
    public void setPpDeclarSignInd( String ppDeclarSignInd )
    {
        this.ppDeclarSignInd = ppDeclarSignInd;
    }

    /**
     * @return the ieStatus
     */
    public String getIeStatus()
    {
        return ieStatus;
    }

    /**
     * @param ieStatus the ieStatus to set
     */
    public void setIeStatus( String ieStatus )
    {
        this.ieStatus = ieStatus;
    }

    /**
     * @return the debtorBic
     */
    public String getDebtorBic()
    {
        return debtorBic;
    }

    /**
     * @param debtorBic the debtorBic to set
     */
    public void setDebtorBic( String debtorBic )
    {
        this.debtorBic = debtorBic;
    }

    /**
     * @return the debtorIban
     */
    public String getDebtorIban()
    {
        return debtorIban;
    }

    /**
     * @param debtorIban the debtorIban to set
     */
    public void setDebtorIban( String debtorIban )
    {
        this.debtorIban = debtorIban;
    }

    /**
     * @return the debtorName
     */
    public String getDebtorName()
    {
        return debtorName;
    }

    /**
     * @param debtorName the debtorName to set
     */
    public void setDebtorName( String debtorName )
    {
        this.debtorName = debtorName;
    }

    /**
     * @return the policyExceptions
     */
    public String getPolicyExceptions()
    {
        return policyExceptions;
    }

    /**
     * @param policyExceptions the policyExceptions to set
     */
    public void setPolicyExceptions( String policyExceptions )
    {
        this.policyExceptions = policyExceptions;
    }

    /**
     * @return the onlineReferFlag
     */
    public String getOnlineReferFlag()
    {
        return onlineReferFlag;
    }

    /**
     * @param onlineReferFlag the onlineReferFlag to set
     */
    public void setOnlineReferFlag( String onlineReferFlag )
    {
        this.onlineReferFlag = onlineReferFlag;
    }

}
