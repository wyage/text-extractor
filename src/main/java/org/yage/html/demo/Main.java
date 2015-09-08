package org.yage.html.demo;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.URL;
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
        
        try{
        	URL url=new URL("http://tech.sina.com.cn/t/4g/2014-05-10/05249370488.shtml");
        	url=new URL("http://tech.sina.com.cn/mobile/n/2013-08-23/06328667223.shtml");
        	//me.doExtracting(ExtractUtils.readContentFromStream(url.openStream(), "gb2312"), Files.newBufferedWriter(Paths.get("dd.txt"), Charset.forName("gbk")));
        	me.doExtracting(ExtractUtils.readContentFromStream(url.openStream(), "gb2312"),new OutputStreamWriter(System.out));
        } catch (IOException e) {
			e.printStackTrace();
		}
        
    }
}
