/**
 * @projectName SimpleStruts
 * @fileName Interceptor03.java
 * @description
 * @author lifl
 * @time 2017ÏÂÎç2:36:34
 *
 */
package com.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class Interceptor03 implements Interceptor {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8819441552957345245L;

	@Override
	public void destroy() {
		/**
		 * method statement
		 */
		// TODO Auto-generated method stub

	}

	@Override
	public void init() {
		/**
		 * method statement
		 */
		// TODO Auto-generated method stub
		System.out.println("interceptor03");

	}

	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		/**
		 * method statement
		 */
		// TODO Auto-generated method stub
		System.out.println("interceptor03 action:" + arg0.getAction());
		return arg0.invoke();
	}
	/**
	 * SimpleStruts TODO
	 */
}
