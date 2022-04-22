package week1.day2;

public class MyCalculator {
	public static void main(String[]args) {
		Calculator obj= new Calculator();
		int add =obj.add(30, 30, 30);
		System.out.println(add);
		int subtract =obj.subtract(50,40);
		System.out.println(subtract);
		double mul =obj.mul(39.44, 38.39);
		System.out.println(mul);
		float divide =obj.divide(5.9f, 4.95859f);
		System.out.println(divide);
		
		
		
	}

}
