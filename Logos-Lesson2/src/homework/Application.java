package homework;

public class Application {

	public static void main(String[] args) {

		rectangle r1 = new rectangle();
			
//		rectangle r3 = new rectangle(50, 20);
		
//		circle c1 = new circle();
		
		circle c3 = new circle(20.2, 40.4);
	
//		System.out.println(r3);
//		System.out.println(r2);
		System.out.println(r1);

		System.out.println("Площа прямокутника = " + r1.getArea());
		System.out.println("Периметр прямокутника = " + r1.getPerimeter());
		
		System.out.println(c3);

		System.out.println("Площа кола = " + c3.getAreaCircle());
		System.out.println("Периметр кола = " + c3.getLenghtCircle());

	}

}
