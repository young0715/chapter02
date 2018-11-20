package paint;

public class Point {
	private int x;
	private int y;
	
//	static을 사용한 이유 : 
//	공통으로 사용하고 싶을 경우, static을 작성함으로써 공통으로 사용하게 된다.
//	주로 사용하는 방법은 아니고, 
//	배열이나, 따로 관리할 때 주로 사용함.
	
//	아래 내용 참조 url(https://wikidocs.net/228)
//	static은 "스태틱"이라고 읽는다.
//	static은 보통 변수나 메소드 앞에 static 키워드를 붙여서 사용하게 된다.
//	static 변수
//	박씨 집안을 나타내는 HousePark이라는 클래스이다. 위와 같은 클래스를 만들고 객체를 생성하면 객체마다 객체변수 lastname을 저장하기 위한 메모리를 별도로 할당해야 한다. 하지만 가만히 생각해 보면 HousePark 클래스의 lastname은 어떤 객체이던지 동일한 값인 "박"이어야 할 것 같지 않은가? 이렇게 항상 값이 변하지 않는 경우라면 static 사용 시 메모리의 이점을 얻을 수 있다.
//	예제))
//	public class HousePark  {
//	    static String lastname = "박";
//	
//	    public static void main(String[] args) {
//	        HousePark pey = new HousePark();
//	        HousePark pes = new HousePark();
//	    }
//	}
//	static method
//	static int count = 0;
//    Counter() {
//        this.count++;
//    }
//
//    public static int getCount() {
//        return count;
//    }
//
//    public static void main(String[] args) {
//        Counter c1 = new Counter();
//        Counter c2 = new Counter();
//
//        System.out.println(Counter.getCount());
//    }
//	getCount() 라는 static 메소드가 추가되었다. main 메소드에서 getCount() 메소드는 Counter.getCount() 와 같이 클래스를 통해 호출할 수 있게 된다.
//	※ 스태틱 메소드 안에서는 인스턴스 변수 접근이 불가능 하다. 위 예에서 count는 static 변수이기 때문에 스태틱 메소드(static method)에서 접근이 가능한 것이다.
//	보통 스태틱 메소드는 유틸리티 성 메소드를 작성할 때 많이 사용된다. 예를 들어 "오늘의 날짜 구하기", "숫자에 콤마 추가하기"등의 메소드를 작성할 때에는 클래스 메소드를 사용하는 것이 유리하다.
//	static이라는 키워드가 메소드 앞에 붙으면 이 메소드는 스태틱 메소드(static method)가 된다.
//	아래 count는 static method이다.
	private static int count;
	
	public void setX(int x) {
		this.x = x;
	}
	public int getX() {
		return x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getY() {
		return y;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getCount() {
		return count;
	}
	
	//생성자 overloading
	//생성자 //기존에 가지고 있는 Default 생성자가 사라짐
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Point int, int call");
	}
	
	//생성자 overloading
	//Default생성자를 사용하려면  생성자 새로 생성할 것.
	public Point() {System.out.println("Point call");}
	
	//생성자 overloading
	public Point(int x) {
		this.x = x;
	}
	
//	위에 생성자 Point(int)형이 이미 있기때문에, 사용할 수 없다.
//	public Point(int y) {
//		this.y = y;
//	}
	
	//method overloading
	public void showInfo() {
		System.out.println("점[x=" + x + ",y=" + y + "]을 그렸습니다.");
		plusCount();
	}
	
	//method overloading
	public void showInfo(boolean flag) {
		if(flag == true)
			showInfo();
		else
			System.out.println("점[x=" + x + ",y=" + y + "]을 지웠습니다.");
	}
	
	public void plusCount() {
		count++;
	}
	
	
}
