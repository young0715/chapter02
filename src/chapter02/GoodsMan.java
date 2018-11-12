package chapter02;

public class GoodsMan {
	
	public static void main(String[] args) {
		Goods camera = new Goods();
		camera.setName("nikon");
		camera.setPrice(400000);
		camera.setCountStock(30);
		camera.setCountSold(50);
		camera.displayInfo();	//캡슐화
		
		System.out.println(Goods.countGoods);
		
		Goods tv = new Goods();
		tv.setName("pavv");
		tv.setPrice(50000);
		tv.setCountStock(10);
		tv.setCountSold(20);
		tv.displayInfo();	//캡슐화
		
		System.out.println(Goods.countGoods);
	}
}
