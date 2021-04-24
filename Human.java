package inheritance;
import java.util.*;
public class Human {
	
	private int age;
	private double weight, height, BMI, total ;
	
	Scanner s = new Scanner(System.in);
	//default constructor
	//Human h = new Human();
	Human() {
		
		
		System.out.print("Enter age : ");
		this.age = s.nextInt();
		System.out.print("Enter weight : ");
		this.weight = s.nextDouble();
		System.out.print("Enter height : ");
		this.height = s.nextDouble();
		System.out.print("Enter BMI : ");
		this.BMI = s.nextDouble();
		System.out.print("Enter total BMI : ");
		this.total = s.nextDouble();
	}
	
	



	//Getter 
		
		public int getage () {
			return age;
		}
		
		public double getweight () {
			return weight;
		}
		
		public double getheight () {
			return height;
		}
		
		public double getBMI () {
			return BMI;
		}
		public double gettotal () {
			return total;
		}
		
}
