package com.Junit_Test;

public class testCase1 {
	
	public  boolean checkStrings(String s) {
		
		if(s.length()<=1) return false;
		if(s.length()==2 ) return true;
		String first2 = s.substring(0,2);
		String last2 = s.substring(s.length()-2);
		
	
		return first2.equals(last2);
		
	}
	
	public String generatePassword(String name, int yearOfBirth) {
		String password = null;
		
		if(name.length()<=4) {
			password = name+yearOfBirth; 
		}else {
			String str = name.substring(0, 4);
			password =str+yearOfBirth;
		}
		System.out.println(password);
		return password;
	}

}
