/*******************************************************************************
 * Copyright (c) 2012 Secure Software Engineering Group at EC SPRIDE.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v2.1
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/old-licenses/gpl-2.0.html
 * 
 * Contributors: Christian Fritz, Steven Arzt, Siegfried Rasthofer, Eric
 * Bodden, and others.
 ******************************************************************************/
package soot.jimple.infoflow.test.securibench.supportClasses;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Locale;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

public class DummyHttpResponse implements HttpServletResponse {

	
	public void flushBuffer() throws IOException {
		// TODO Auto-generated method stub

	}

	
	@SuppressWarnings("rawtypes")
	public java.util.Collection<java.lang.String> getHeaders(String arg0) {
		return Arrays.asList("secret1", "secret2", "secret3");
	}

	
	public String getHeader(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public int getStatus() {
		return 0;
	}

	
	public int getBufferSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	@SuppressWarnings("rawtypes")
	public java.util.Collection<java.lang.String> getHeaderNames() {
		return Arrays.asList("secret1", "secret2", "secret3");
	}

	
	public String getCharacterEncoding() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public Locale getLocale() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public ServletOutputStream getOutputStream() throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	
	public PrintWriter getWriter() throws IOException {
		// TODO Auto-generated method stub
		return new PrintWriter("123");
	}

	
	public boolean isCommitted() {
		// TODO Auto-generated method stub
		return false;
	}

	
	public void reset() {
		// TODO Auto-generated method stub

	}

	
	public void resetBuffer() {
		// TODO Auto-generated method stub

	}

	
	public void setBufferSize(int arg0) {
		// TODO Auto-generated method stub

	}

	
	public void setContentLength(int arg0) {
		// TODO Auto-generated method stub

	}

	
	public void setContentType(String arg0) {
		// TODO Auto-generated method stub

	}

	
	public void setLocale(Locale arg0) {
		// TODO Auto-generated method stub

	}

	
	public void addCookie(Cookie arg0) {
		// TODO Auto-generated method stub

	}

	
	public void addDateHeader(String arg0, long arg1) {
		// TODO Auto-generated method stub

	}

	
	public void addHeader(String arg0, String arg1) {
		// TODO Auto-generated method stub

	}

	
	public void addIntHeader(String arg0, int arg1) {
		// TODO Auto-generated method stub

	}

	
	public boolean containsHeader(String arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public String encodeRedirectURL(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public String encodeRedirectUrl(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public String encodeURL(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public String encodeUrl(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public void sendError(int arg0) throws IOException {
		// TODO Auto-generated method stub

	}

	
	public void sendError(int arg0, String arg1) throws IOException {
		// TODO Auto-generated method stub

	}

	
	public void sendRedirect(String arg0) throws IOException {
		// TODO Auto-generated method stub

	}

	
	public void setDateHeader(String arg0, long arg1) {
		// TODO Auto-generated method stub

	}

	
	public void setHeader(String arg0, String arg1) {
		// TODO Auto-generated method stub

	}

	
	public void setIntHeader(String arg0, int arg1) {
		// TODO Auto-generated method stub

	}

	
	public void setStatus(int arg0) {
		// TODO Auto-generated method stub

	}

	
	public void setStatus(int arg0, String arg1) {
		// TODO Auto-generated method stub

	}

	
	public String getContentType() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public void setCharacterEncoding(String arg0) {
		// TODO Auto-generated method stub

	}

	
	public void setContentLengthLong(long len) {
		// TODO Auto-generated method stub

	}

}
