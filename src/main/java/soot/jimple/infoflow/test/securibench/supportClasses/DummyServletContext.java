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

import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Enumeration;
import java.util.EventListener;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

import javax.servlet.Filter;
import javax.servlet.FilterRegistration;
import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import javax.servlet.SessionCookieConfig;
import javax.servlet.SessionTrackingMode;
import javax.servlet.descriptor.JspConfigDescriptor;

public class DummyServletContext implements ServletContext {

	
	public Object getAttribute(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("rawtypes")
	
	public Enumeration getAttributeNames() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public ServletContext getContext(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public String getInitParameter(String arg0) {
		return arg0;
	}

	
	public String getContextPath() {
		return null;
	}

	
	public int getEffectiveMajorVersion() {
		return 0;
	}

	
	public int getEffectiveMinorVersion() {
		return 0;
	}

	
	public boolean setInitParameter(String s, String s1) {
		return false;
	}

	
	public ServletRegistration.Dynamic addServlet(String s, String s1) {
		return null;
	}

	
	public ServletRegistration.Dynamic addServlet(String s, Servlet servlet) {
		return null;
	}

	
	public ServletRegistration.Dynamic addServlet(String s, Class<? extends Servlet> aClass) {
		return null;
	}

	
	public <T extends Servlet> T createServlet(Class<T> aClass) throws ServletException {
		return null;
	}

	
	public ServletRegistration getServletRegistration(String s) {
		return null;
	}

	
	public Map<String, ? extends ServletRegistration> getServletRegistrations() {
		return null;
	}

	
	public FilterRegistration.Dynamic addFilter(String s, String s1) {
		return null;
	}

	
	public FilterRegistration.Dynamic addFilter(String s, Filter filter) {
		return null;
	}

	
	public FilterRegistration.Dynamic addFilter(String s, Class<? extends Filter> aClass) {
		return null;
	}

	
	public <T extends Filter> T createFilter(Class<T> aClass) throws ServletException {
		return null;
	}

	
	public FilterRegistration getFilterRegistration(String s) {
		return null;
	}

	
	public Map<String, ? extends FilterRegistration> getFilterRegistrations() {
		return null;
	}

	
	public SessionCookieConfig getSessionCookieConfig() {
		return null;
	}

	
	public void setSessionTrackingModes(Set<SessionTrackingMode> set) {

	}

	
	public Set<SessionTrackingMode> getDefaultSessionTrackingModes() {
		return null;
	}

	
	public Set<SessionTrackingMode> getEffectiveSessionTrackingModes() {
		return null;
	}

	
	public void addListener(String s) {

	}

	
	public <T extends EventListener> void addListener(T t) {

	}

	
	public void addListener(Class<? extends EventListener> aClass) {

	}

	
	public <T extends EventListener> T createListener(Class<T> aClass) throws ServletException {
		return null;
	}

	
	public JspConfigDescriptor getJspConfigDescriptor() {
		return null;
	}

	
	public ClassLoader getClassLoader() {
		return null;
	}

	
	public void declareRoles(String... strings) {

	}

	@SuppressWarnings("rawtypes")
	
	public Enumeration getInitParameterNames() {
		return new StringTokenizer("one two three");
	}

	
	public int getMajorVersion() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	public String getMimeType(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public int getMinorVersion() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	public RequestDispatcher getNamedDispatcher(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public String getRealPath(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public RequestDispatcher getRequestDispatcher(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public URL getResource(String arg0) throws MalformedURLException {
		// TODO Auto-generated method stub
		return null;
	}

	
	public InputStream getResourceAsStream(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("rawtypes")
	
	public Set getResourcePaths(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public String getServerInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public Servlet getServlet(String arg0) throws ServletException {
		// TODO Auto-generated method stub
		return null;
	}

	
	public String getServletContextName() {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("rawtypes")
	
	public Enumeration getServletNames() {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("rawtypes")
	
	public Enumeration getServlets() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public void log(String arg0) {
		// TODO Auto-generated method stub

	}

	
	public void log(Exception arg0, String arg1) {
		// TODO Auto-generated method stub

	}

	
	public void log(String arg0, Throwable arg1) {
		// TODO Auto-generated method stub

	}

	
	public void removeAttribute(String arg0) {
		// TODO Auto-generated method stub

	}

	
	public void setAttribute(String arg0, Object arg1) {
		// TODO Auto-generated method stub

	}

	
	public String getVirtualServerName() {
		// TODO Auto-generated method stub
		return null;
	}

}
