package chapter02;

public class Goods {
	private String name;
	private int price;
	private int countStock;
	private int countSold;
	
	public static int countGoods;
	
	//기본생성자 (자바는 기본적으로 기본생성자를 만들어준다.)
	public Goods() {
		Goods.countGoods++;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCountStock() {
		return countStock;
	}
	public void setCountStock(int countStock) {
		this.countStock = countStock;
	}
	public int getCountSold() {
		return countSold;
	}
	public void setCountSold(int countSold) {
		this.countSold = countSold;
	}
	
	public void displayInfo() {
		for(int i=0; i<2; i++) {
			String title = "이름";
			System.out.println(title + ":" + name);
			System.out.println("가격:" + price);
			System.out.println("재고:" + countStock);
			System.out.println("판매:" + countSold);
			System.out.println("");
		}
		
//		오류 : title 지역변수 {} 빠져나오면 사라진다.
//		System.out.println(title);
	}
}
