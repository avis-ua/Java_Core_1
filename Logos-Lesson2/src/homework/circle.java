package homework;

public class circle {
		
		private double Radius;
		private double Diametr;
		public double AreaCircle;
		public double LenghtCircle;
		
		circle (){
			this.Radius = 10.5;
			this.Radius = 15.2;
		}
		
		circle (double Radius, double Diametr){
			this.Radius = Radius;
			this.Diametr = Diametr;
		}


		public double getRadius() {
			return Radius;
		}

		public void setRadius(double radius) {
			Radius = radius;
		}

		public double getDiametr() {
			return Diametr;
		}

		public void setDiametr(double diametr) {
			Diametr = diametr;
		}


		public double getAreaCircle() {
			double AreaCircle = 3.14 * Radius * Radius ;
			return AreaCircle;
		}
		
		public double getLenghtCircle() {
			double LenghtCircle = 3.14 * Diametr;
			return LenghtCircle;
		}

		@Override
		public String toString() {
			return "circle [Radius=" + Radius + ", Diametr=" + Diametr + "]";
		}

	}
