/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.yage.html;

/**
 * Entity class, separates different parts of a string block
 * @author beethoven99@126.com
 * @since 0.1
 */
public class StringPair {
	
	/* text contained in links*/
    public String strHref;
    
    /* text not contained in links*/
    public String strOther;
    
    public StringPair(){
        this.strHref="";
        this.strOther="";
    }
    
    @Override
    public String toString(){
        return String.format("StringPair.class:%d/%d", this.strHref.length(), this.strOther.length());
    }
    
}
