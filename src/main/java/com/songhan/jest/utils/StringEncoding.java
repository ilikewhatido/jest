package com.songhan.jest.utils;

public class StringEncoding {
	
	public static final String UTF8 = "UTF-8";

	/**
	 * Convert String to UTF-8 String
	 * @param s
	 * @return
	 */
	public static String convertToUTF8(String s) {
		String out = null;
		try {
			out = new String(s.getBytes(StringEncoding.UTF8), StringEncoding.UTF8);
		} catch (java.io.UnsupportedEncodingException e) {
			return null;
		}
		return out;
	}
}
