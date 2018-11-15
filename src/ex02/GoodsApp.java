package ex02;

public class GoodsApp {

	public static void main(String[] args) {
		
		new Goods("nikon", 400000);
		new Goods("mug Cup", 50000);
		
		Goods camera = new Goods();
		camera.setName("니콘");
		camera.setPrice(450000);
		System.out.print("상품 : " + camera.getName() + "  ");
		System.out.println("가격 : " + camera.getPrice());
		
		Goods computer = new Goods("LG gram");
		computer.setPrice(250000);
		//name을 String name에 변수를 담지 않았기 때문에, null값으로 return 됨
		System.out.println("computer 상품 : " + computer.getName() + "  가격 : " + computer.getPrice());
		
		
		Goods cup = new Goods("cup", 50000);
		int discountCupPice = cup.calcDiscountPrice(0.3f);
		System.out.println(discountCupPice);
	}

}
