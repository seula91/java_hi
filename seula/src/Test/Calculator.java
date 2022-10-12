package Test;

import java.util.Scanner;

public class Calculator{

	public static void main(String[] args) {

		//git 테스트
		//슬아씨 반복 가능하게 부탁드립니다.
		String sign = "";
		Scanner sc = new Scanner(System.in);
		Calcu cal = new Calcu();
		
		// 숫자는 각각 물어볼 수 있게
		
		while(true) {
		
		System.out.println("A, B에 숫자를 입력하세요");
		
		try{
		System.out.print(" A : ");
		cal.A = sc.nextInt();
		
		System.out.print(" B : ");

		cal.B = sc.nextInt();
		}catch(Exception e){
			System.out.println("숫자만 입력해주세요");
		}
		
		System.out.println("사용할 사칙연산을 입력하세요~");
		
		System.out.print("sign (+,-,*,/) : ");
		sign = sc.next();	
		
		
		
		
			
			switch (sign) {
			case "+":
				System.out.print("계산결과는 ");
				System.out.println(cal.add());
				break;
			case "-":
				System.out.print("계산결과는 ");
				System.out.println(cal.sub());
				break;
			case "*":
				System.out.print("계산결과는 ");
				System.out.println(cal.multi());			
				break;
			case "/":
				System.out.print("계산결과는 ");
			if(cal.B==0) {
					System.out.print("0을 입력하지 마세요");					
				}else {
				System.out.println(cal.division());
				}
				break;
			default:
				System.out.print("잘못 입력하셨습니다");
				break;
				
				
		
		}
		System.out.println("사칙연산을 그만하려면 'n'를 입력해주세요");
		String n= sc.next();
		if(n.equals("n")) {		
			break;
		}	
		}
	}
}
class Calcu {
	int A,B;

	int add() {
		return A+B;
	}
	int sub() {
		return A-B;
	}
	int multi() {
		return A*B;
	}
	int division() {
		return A/B;
	}
}

	
