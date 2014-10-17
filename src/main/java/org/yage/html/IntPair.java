package org.yage.html;

/**
 * Integer class, for different parts' length of a string block
 * @author beethoven99@126.com
 * @since 0.1
 */
public class IntPair {
    
	/*length of link text*/
	public int lengthOfHref;
	
	/*length of non-link text*/
    public int lengthOfOther;
    
    public IntPair(){
        this.lengthOfHref=0;
        this.lengthOfOther=0;
    }
    
    @Override
    public String toString(){
        return this.lengthOfHref+"/"+this.lengthOfOther;
    }
    
}
