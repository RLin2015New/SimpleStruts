/**
 * @projectName SimpleStruts
 * @fileName Test.java
 * @description
 * @author lifl
 * @time 2017обнГ4:02:48
 *
 */
package com.test;

import com.opensymphony.xwork2.ActionSupport;

public class TestAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7678204207490804724L;

	/**
	 * 
	 * @description
	 * @return String
	 * @time 2017ионГ10:29:30
	 */
	public String test() {
		System.out.println("test action 001");
		return "success";
	}

}
