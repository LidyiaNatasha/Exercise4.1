package inheritance;
import java.util.*;

public class Male extends Human   {
	Scanner scan = new Scanner(System.in);
	private String gender;
	private String name;
	private String job;
	private int age;
	private double weight, height, BMI, total ;
	
	
	//default constructor
	//Human h = new Human();
	Male() {
		
		System.out.print("Enter gender : ");
		this.gender = s.nextLine();
		System.out.print("Enter name : ");
		this.name= s.nextLine();		
		System.out.print("Enter job : ");
		this.job = s.nextLine();
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
		public String getgender () {
			return gender;
		}
		
		public String getname () {
			return name;
		}
		
		public String getjob () {
			return job;
		}
		
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
	
	
	
	
	
	
	

