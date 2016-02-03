// 5606021622010 นายกมลภพ แพงวังทอง  IT_3RC
package Hw1_01;
import java.util.*;
public class Hw1_01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("+++Menu+++");
		System.out.println("1. Rectangle");
		System.out.println("2. Circle");
		System.out.println("3. Triangle");
		System.out.print("Enter number:");
		char ch = s.next().charAt(0);
		System.out.print(
				(ch == '1')? 
						"******\n"
					  + "*    *\n"
					  + "*    *\n"
					  + "******\n"
					  : ""
				
		);
		
		System.out.print(
				(ch == '2')? 
					    " ***\n"
					  + "*    *\n"
					  + "*    *\n"
					  + " ***\n"
					  : ""
				
		);
		System.out.print(
				(ch == '3')? 
					    "*\n"
					  + "**\n"
					  + "***\n"
					  + "****\n"
					  : ""
				
		);
	}//exit main
}//exit class
