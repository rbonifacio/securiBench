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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.Principal;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;

import javax.servlet.AsyncContext;
import javax.servlet.DispatcherType;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpUpgradeHandler;
import javax.servlet.http.Part;

public class DummyHttpRequest implements HttpServletRequest {
	enum count {
		ONE, TWO
	}

	;

	
	public Object getAttribute(String arg0) {
		return "";
	}

	
	public AsyncContext getAsyncContext() {
		return null;
	}

	
	public ServletContext getServletContext() {
		return null;
	}

	
	public AsyncContext startAsync() {
		return null;
	}

	
	public AsyncContext startAsync(ServletRequest servletRequest, ServletResponse servletResponse) {
		return null;
	}

	
	public boolean isAsyncSupported() {
		return true;
	}

	
	public boolean isAsyncStarted() {
		return true;
	}

	
	public boolean authenticate(HttpServletResponse response) {
		return true;
	}

	
	@SuppressWarnings("rawtypes")
	public Enumeration getAttributeNames() {

		return new StringTokenizer("one two");
	}

	
	public String getCharacterEncoding() {
		return "UTF-8";
	}

	
	public int getContentLength() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	public String getContentType() {
		// TODO Auto-generated method stub
		return "contenttype";
	}

	
	public ServletInputStream getInputStream() throws IOException {
		// TODO Auto-generated method stub
		return new DummyServletInputStream();
	}

	
	public Locale getLocale() {
		// TODO Auto-generated method stub
		return Locale.ENGLISH;
	}

	
	@SuppressWarnings("rawtypes")
	public Enumeration getLocales() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public String getParameter(String arg0) {
		// TODO Auto-generated method stub
		return arg0;
	}

	
	@SuppressWarnings("rawtypes")
	public Map getParameterMap() {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("dummy", "dummy");
		return map;
	}

	
	public Part getPart(String name) {
		return null;
	}

	
	public java.util.Collection<Part> getParts() {
		return null;
	}

	
	public void logout() {

	}

	
	public void login(String user, String pwd) {

	}

	
	@SuppressWarnings("rawtypes")
	public Enumeration getParameterNames() {
		// TODO Auto-generated method stub
		return new StringTokenizer("parameter names");
	}

	
	public String[] getParameterValues(String arg0) {
		// TODO Auto-generated method stub
		return new String[] { arg0 };
	}

	
	public String getProtocol() {
		// TODO Auto-generated method stub
		return "";
	}

	
	public DispatcherType getDispatcherType() {
		return null;
	}

	
	public BufferedReader getReader() throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	
	public String getRealPath(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public String getRemoteAddr() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public String getRemoteHost() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public RequestDispatcher getRequestDispatcher(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public String getScheme() {
		// TODO Auto-generated method stub
		return "";
	}

	
	public String getServerName() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public int getServerPort() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	public boolean isSecure() {
		// TODO Auto-generated method stub
		return false;
	}

	
	public void removeAttribute(String arg0) {
		// TODO Auto-generated method stub

	}

	
	public void setAttribute(String arg0, Object arg1) {
		// TODO Auto-generated method stub

	}

	
	public void setCharacterEncoding(String arg0) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub

	}

	
	public String getAuthType() {
		// TODO Auto-generated method stub
		return "";
	}

	
	public String getContextPath() {
		// TODO Auto-generated method stub
		return "";
	}

	
	public Cookie[] getCookies() {
		Cookie c = new Cookie("", "");
		return new Cookie[] { c };
	}

	
	public long getDateHeader(String arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	public String getHeader(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	
	@SuppressWarnings("rawtypes")
	public Enumeration getHeaderNames() {
		return new StringTokenizer("secret1 secret2 secret3");
	}

	
	@SuppressWarnings("rawtypes")
	public Enumeration getHeaders(String arg0) {
		return new StringTokenizer("secret1 secret2 secret3");
	}

	
	public int getIntHeader(String arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	public String getMethod() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public String getPathInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public String getPathTranslated() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public String getQueryString() {
		// TODO Auto-generated method stub
		return "";
	}

	
	public String getRemoteUser() {
		// TODO Auto-generated method stub
		return "";
	}

	
	public String getRequestURI() {
		// TODO Auto-generated method stub
		return "";
	}

	
	public StringBuffer getRequestURL() {
		// TODO Auto-generated method stub
		return new StringBuffer("http://");
	}

	
	public String getRequestedSessionId() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public String getServletPath() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public HttpSession getSession() {
		return new DummyHttpSession();
	}

	
	public HttpSession getSession(boolean arg0) {
		// TODO Auto-generated method stub
		return new DummyHttpSession();
	}

	
	public Principal getUserPrincipal() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public boolean isRequestedSessionIdFromCookie() {
		// TODO Auto-generated method stub
		return false;
	}

	
	public boolean isRequestedSessionIdFromURL() {
		// TODO Auto-generated method stub
		return false;
	}

	
	public boolean isRequestedSessionIdFromUrl() {
		// TODO Auto-generated method stub
		return false;
	}

	
	public boolean isRequestedSessionIdValid() {
		// TODO Auto-generated method stub
		return false;
	}

	
	public boolean isUserInRole(String arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public String getLocalAddr() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public String getLocalName() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public int getLocalPort() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	public int getRemotePort() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	public long getContentLengthLong() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	public String changeSessionId() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public <T extends HttpUpgradeHandler> T upgrade(Class<T> handlerClass) throws IOException, ServletException {
		// TODO Auto-generated method stub
		return null;
	}

}
