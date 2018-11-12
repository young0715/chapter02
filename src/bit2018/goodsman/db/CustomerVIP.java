package bit2018.goodsman.db;

import bit2018.goodsman.data.Customer;

public class CustomerVIP extends Customer {
	void set() {
		//public은 자식클래스에서 접근이 가능하다.
		name = "hsy";
		
		//protected는 자식클래스에서 접근이 가능하다.
		phone = "000-0000-0000";
		
		//private는 자식클래스에서 접근이 불가능하다.
		//email = "hsy@hsy.com";
	}
}
