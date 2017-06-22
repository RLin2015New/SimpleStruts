/**
 * @projectName SimpleStruts
 * @fileName Interceptor01.java
 * @description
 * @author lifl
 * @time 2017ÏÂÎç2:35:27
 *
 */
package com.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class Interceptor01 implements Interceptor {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5412017002517460404L;

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
		System.out.println("interceptor01");
	}

	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		/**
		 * method statement
		 */
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * SimpleStruts TODO
	 */
}
