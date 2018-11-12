package bit2018.goodsman.data;

public class Customer {
	public String name;
	protected String phone;
	private String email;
	
	void setInfo() {
		//public은 자기안에 접근이 가능하다
		name = "도우넛";
		
		//protected는 자기안에 접근이 가능하다.
		phone = "000-0000-0000";
		
		//private는 자기안에 접근이 가능하다.
		email = "도우넛@도우넛.com";
		
	}
}
