package com.pool.service.basic;

import java.util.List;

public class BasicService {

	private String userId = "408";
	private String duplicateUserId = userId;

	private String[] firstThreeLetters = { "A", "B", "C" };

	private List<String> userIdList = List.of("408", "423", "508");

	public int add(int input1, int input2) {
		return input1 + input2;
	}

	public Object checkNull(Object myObject) {
		if (null != myObject) {
			return myObject;
		}
		return null;
	}

	public String getUserId() {
		return userId;
	}

	public String getDuplicateUserId() {
		return duplicateUserId;
	}

	public boolean isGreater(int input1, int input2) {
		return input1 > input2;
	}

	public String[] getFirstThreeLetters() {
		return firstThreeLetters;
	}

	public List<String> getUserIdList() {
		return userIdList;
	}

	public String isNumberPositive(int input) throws Exception {
		if (input < 0) {
			throw new Exception("Number is not possitive number");
		}
		return "All Good";
	}

	public void checkout() throws InterruptedException {
		System.out.println("I am going to sleep");
		Thread.sleep(2000);
		System.out.println("Sleeping over");
	}
}
