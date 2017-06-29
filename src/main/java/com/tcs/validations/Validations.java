package com.tcs.validations;

public class Validations {

	public boolean validateEmail(String eemail) {
		if (eemail == null) {
			return false;
		} else {
			return true;
		}
	}

	public boolean validatePassword(String password) {
		if (password.length() <= 10 || password.length() >= 5) {
			return true;
		} else {
			return false;

		}
	}
}
