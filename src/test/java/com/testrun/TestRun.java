package com.testrun;

import com.generic.OnlineBanking;

public class TestRun {

public static void main(String[] args) {
		OnlineBanking obj = new OnlineBanking();
		obj.getLogin();
		int returnValue = obj.getAccount();
		System.out.println(returnValue);
	}
}
