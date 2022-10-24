package homework;

public class rectangle {

		private int SideA;
		private int SideB;
		public int Area;
		public int Perimeter;
		
		rectangle (){
			this.SideA = 10;
			this.SideB = 15;
		}
		
		rectangle (int SideA, int SideB){
			this.SideA = SideA;
			this.SideB = SideB;
		}

		
		
		public int getSideA() {
			return SideA;
		}

		public void setSideA(int sideA) {
			SideA = sideA;
		}

		public int getSideB() {
			return SideB;
		}

		public void setSideB(int sideB) {
			SideB = sideB;
		}

		public int getArea() {
			int Area = SideA * SideB;
			return Area;
		}
		
		public int getPerimeter() {
			int Perimeter = (SideA + SideB) * 2;
			return Perimeter;
		}

		@Override
		public String toString() {
			return "rectangle [SideA=" + SideA + ", SideB=" + SideB + "]";
		}
		 

	}
