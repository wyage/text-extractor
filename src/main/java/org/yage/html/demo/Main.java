package org.yage.html.demo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;

import org.yage.html.ContentExtractor;
import org.yage.html.ExtractUtils;

/**
 * Hello world for TextExtractor
 * 2014-10-17 22:05:46
 * @author beethoven99@126.com
 */
public class Main {
    public static void main(String[] args){
    	
    	ContentExtractor me=new ContentExtractor();
        me.setUseTitleTag(true);
        
        String fname="org/yage/html/demo/a1.htm";
        InputStream istream=null;
        FileWriter fwriter=null;
        try{
        	istream=ClassLoader.getSystemResourceAsStream(fname);
    		fwriter=new FileWriter(new File("out.txt"));
        	me.doExtracting(ExtractUtils.readContentFromStream(istream), fwriter);
        } catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				fwriter.close();
				istream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
        System.out.println("run finished.");
    }
}
