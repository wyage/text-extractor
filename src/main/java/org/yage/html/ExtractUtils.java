package org.yage.html;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ExtractUtils {
	
	/**
	 * 从流里面读取字符内容
	 * @param is
	 * @return
	 */
	public static String readContentFromStream(InputStream is){
		StringBuilder sb=new StringBuilder();
		try(BufferedReader br=new BufferedReader(new InputStreamReader(is))){
			String line=br.readLine();
			while(line!=null){
				sb.append(line);
				line=br.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sb.toString();
	}
	
}
