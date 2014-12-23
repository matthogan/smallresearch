/**
 * 
 */
package com.softhog.research.spark;

/**
 * @author 
 *
 */
public class TextMessage extends Message
{
    /** */
    private String text;
    
    /**
     * 
     */
    public TextMessage()
    {
    }

    /**
     * @param text
     */
    public TextMessage( String text )
    {
        setText( text );
    }

    /**
     * @return
     */
    public String getText()
    {
        return text;
    }

    /**
     * @param text
     */
    public void setText( String text )
    {
        this.text = text;
    }
    
    
}
