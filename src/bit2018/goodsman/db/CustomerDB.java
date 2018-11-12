package bit2018.goodsman.db;

import bit2018.goodsman.data.Customer;

public class CustomerDB {
	void insert() {
		Customer c = new Customer();
		
		//puclic은 다른패키지(외부)에서 접근이 가능하다.
		c.name = "hsy";
		
		//protected는 다른패키지(외부)에서 접근이 불가능하다.
		//c.phone = "000-0000-0000";
		//예외로, 접근이 한군데 되는곳이 있다.(자식클래스에서 접근이 가능하다.)
		//bit2018.goodsman.db > CustomerVIP.java에서 확인이 가능하다. 
		
		//private는 다른패키지(외부)에서 접근이 불가능하다.
		//c.email = "hsy@hsy.com";
		
	}
}
