package com.dvorskij.aop;

import static com.dvorskij.aop.Contexts.*;

public class Test {

	public static void main(String[] args) {
		IExamination exj = CONTEXT.getBean("eJava", IExamination.class);
		exj.passExam();
		System.out.println("----------------------------------------");
		exj.failExam();
	}

}
