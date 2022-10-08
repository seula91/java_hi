package Test;

import java.util.Scanner;

public class 약수구하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to obtain the maximum number of pledges: ");
		
		int num = sc.nextInt();
		
	}
		
		public static String divisor(int num){
		
		if(num<1) 
			return "Enter a value greater than or equal to 1";
		
		
		String result = num+"maximum number of pledges:";
		
		for(int i=1; i<=num; i++) {
			if(num%i == 0)
			result += i +" ";
		}
		return result;
		
	}

}
