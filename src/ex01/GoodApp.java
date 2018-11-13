package ex01;

public class GoodApp {

	public static void main(String[] args) {
		
		Goods camera = new Goods();
		camera.setName("nikon");
		camera.setPrice(400000);
		camera.showInfo();
		
		Goods cup = new Goods();
		cup.setName("cup");
		cup.setPrice(30000);
		cup.showInfo();
		
		Goods computer= new Goods();
		computer.setName("LG gram");
		computer.setPrice(2500000);
		computer.showInfo();
	}
}
