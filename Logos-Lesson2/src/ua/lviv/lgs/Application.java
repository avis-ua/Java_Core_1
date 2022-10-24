package ua.lviv.lgs;

public class Application {

	public static void main(String[] args) {

		Animal a1 = new Animal();
		
		Animal a2 = new Animal(22);
		
		Animal a3 = new Animal("Gorilla", "Mike", 50, "Black");
		
		//System.out.println(a1);
		//System.out.println(a2);
		System.out.println(a3);
	}

}
