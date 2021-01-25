package myPackage;

public class SwitchCase {

	public static void main(String[] args) {
         int day=2;
		
		switch(day) {
			case 1: System.out.println("this is Sunday");
			break;
			case 2: System.out.println("this is Monday");
			break;
			case 3: System.out.println("this is Tuesday");
			break;
			case 4: System.out.println("this is Wednesday");
			break;
			case 5: System.out.println("this is Thursday");
			break;
			case 6: System.out.println("this is Friday");
			break;
			case 7: System.out.println("this is Saturday");
			break;
			default: System.out.println("Invalid Week Number");
	}

	}
}
