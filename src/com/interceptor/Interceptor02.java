/**
 * @projectName SimpleStruts
 * @fileName Interceptor02.java
 * @description
 * @author lifl
 * @time 2017ÏÂÎç2:36:08
 *
 */
package com.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class Interceptor02 implements Interceptor {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4352942231932728477L;

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
		System.out.println("interceptor02");
	}

	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		/**
		 * method statement
		 */
		// TODO Auto-generated method stub
		System.out.println("interceptor02 action:" + arg0.getAction());
		return arg0.invoke();
	}
	/**
	 * SimpleStruts TODO
	 */
}
