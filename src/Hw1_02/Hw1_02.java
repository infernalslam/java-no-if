// 5606021622010 นายกมลภพ  เพงวังทอง  IT_3RC
package Hw1_02;
import java.util.*;
import java.math.BigInteger;
public class Hw1_02 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int decimal = 0;
		System.out.print("Enter decimal value:");
		decimal = s.nextInt();
		
		while(decimal>15){
			System.out.print("Enter decimal again:");
			decimal = s.nextInt();
		}
		String bit = ""+decimal;
		String ans = decTobin(bit);
		
		System.out.print (
				(ans.equals("1"))?  "binary value:000"+ans : ""
				
	    );
		System.out.print (
				(ans.equals("10"))?  "binary value:00"+ans : ""
				
	    );
		System.out.print (
				(ans.equals("11"))?  "binary value:00"+ans: ""
				
	    );
		System.out.print(
				(ans.equals("111"))?  "binary value:0"+ans : ""
				
	    );
		System.out.print (
				(ans.equals("100"))?  "binary value:0"+ans : ""
				
	    );
		System.out.print (
				(ans.equals("101"))?  "binary value:0"+ans : ""
				
	    );
		System.out.print (
				(ans.equals("110"))?  "binary value:0"+ans : ""
				
	    );
		
		System.out.print (
				(!ans.equals("111")&&!ans.equals("11")&&!ans.equals("1")&&!ans.equals("100")&&!ans.equals("101")&&!ans.equals("110")
				 &&!ans.equals("10"))?  "binary value:"+ans : ""
				
	    );
		
		

	}
		public static String  decTobin(String decimal){
			return new BigInteger(decimal).toString(2);
		 }

}
