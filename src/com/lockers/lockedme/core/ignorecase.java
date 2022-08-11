package com.lockers.lockedme.core;

import java.util.Comparator;

public class ignorecase implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		// TODO Auto-generated method stub
		return s1.compareToIgnoreCase(s2);
	}

}
