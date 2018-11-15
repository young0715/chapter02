package ex02;

public class Goods {

	private String name;
	private int price;
	
	//생성자
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
		System.out.println("상품 : " + name + "  가격 : " + price);
	}
	
	//생성자 (기본 내장되어 있지만, 생성자를 생성했기 때문에 비어있는 생성자 생성)
	//생성자 overloading 이라고한다.(모든걸 메모리에 올려버림)
	public Goods() {}
	
	public Goods(String name) {
		this(name, 0);
	}

	public Goods(int price) {
		this("", price);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	
	public int calcDiscountPrice(float discountRate) {
		int discountPrice = price - (int)(price * discountRate);
		return discountPrice;
	}
	
	public void showIndo() {
		System.out.println("상품 : " + name + "  가격 : " + price);
	}
}
