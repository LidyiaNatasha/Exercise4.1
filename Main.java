package inheritance;


public class Main {

	public static void main(String[] args) {
	
			Human a = new Human();
			System.out.println("age  : " + a.getage());
			System.out.printf("Weight: %.2f kg %n",a.getweight(), "Kg" );
			System.out.printf("Height: %.2f kg %n",a.getheight(), "meter");
			System.out.printf("BMI: %.2fkg %n",a.getBMI());
			System.out.printf("total BMI: %.2fkg %n",a.gettotal());
			
			System.out.println("\n\n");
			
			Human b = new Human();
			System.out.println("age  : " + b.getage());
			System.out.printf("Weight: %.2f kg %n",b.getweight() );
			System.out.printf("Height: %.2f kg %n",b.getheight() );
			System.out.printf("BMI: %.2fkg %n",b.getBMI());
			System.out.printf("Total BMI: %.2fkg %n",b.gettotal());	

	}

	}


