package com.java8.improvements;

import java.io.UnsupportedEncodingException;
import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Finally, Java SE8 will now have a standard way of dealing with base64
 * encoding and decoding and developers can stop using non-public APIs to do
 * that. Methods line encode, encodeToString, decode and wrap are now available.
 * We can see an example below.
 * 
 * @see http://bravenewtalent.curatasite.com/articles/share/455996/
 * @author Constantin Marian Alin
 * 
 */
public class Base64EncodingDecoding {

	public static void main(String[] args) {
		String asB64;
		byte[] asBytes = Base64.getDecoder().decode("SmF2YTggQmFzZTY0IEVuY29kaW5nICYgRGVjb2Rpbmc=");
		try {
			// Encode
			asB64 = Base64.getEncoder().encodeToString("Java8 Base64 Encoding & Decoding".getBytes("utf-8"));
			System.out.println(asB64);

			// Decode
			System.out.println(new String(asBytes, "utf-8"));
		} catch (UnsupportedEncodingException ex) {
			Logger.getLogger(Base64EncodingDecoding.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

}
