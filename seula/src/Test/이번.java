package Test;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class 이번 {
	public static void main(String[] args) {
		
//Q1.		
//		for(int i=1; i<=10; i++) {
//			System.out.print("*");
//		}
		
//Q2.
//		for(int i=1; i<=10; i++) {
//			System.out.println("*");
//		}

//Q3.
//		for(int i=1; i<=5; i++) {
//			System.out.print("");
//			for(int j=1; j<=5; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//Q4.
//		for(int i=1; i<=5; i++) {
//			for(int j=1; j<=5; j++) {
//				System.out.print(i);
//			}
//			System.out.println();
//		}
		
//Q4.
//		 for(int i=1; i<=5; i++) {
//			 System.out.print(i);
//			 for(int j=1; j<=4; j++) {
//				 System.out.print(i);
//			 }
//			 System.out.println();
//		 }
		
//Q5.     
//		for(int i=1; i<=4; i++) {
//			for(int j=1; j<=5; j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//			
//		 }
		
//Q6.
//		for(int i=1; i<=5; i++) {
//			System.out.print(i);
//			for(int j=1; j<=4; j++) {
//				System.out.print(j+i);
//			}
//			System.out.println();
//		}
//Q7.
//		for(int i=5; i>=1; i--) {
//			System.out.print(i);
//			for(int j=i+1; j<=4+i; j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}

//Q8.  
//		for(int i=1; i<=5; i++) {
//		  System.out.print("");
//		   for(int j=1; j<=i; j++) {
//			System.out.print("*");
//		}
//		  System.out.println();
//	}
		
		
//Q9.
//		for(int i=1; i<=5; i++) {
//			for(int j=1; j<=6-i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//Q10.
//		for(int i=1; i<=5; i++) {
//			  for(int j=1; j<=6-i; j++) {
//				  System.out.print("*");
//			   }
//			   System.out.println("");
//		    for(int z=2; z<=i+1; z++) 
//			System.out.print(" ");
//		}
		
		
//Q.10
//		for(int i=1; i<=5; i++) {
//			for(int j=1; j<=6-i; j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//			for(int z=1; z<=i; z++)
//				System.out.print(" ");
//		}
		
//Q.11
//		for(int i=1; i<=5; i++) {
//			for(int j=1; j<=5-i; j++) {
//				System.out.print(" ");
//			}
//			for(int z=1; z<=i; z++) {
//				System.out.print("*");
//		}
//			System.out.println("");
//	  }
		
//Q.12
		
//	 for(int i=1; i<=5; i++) {
//		if(i<=5) {
//				System.out.print("*");
//			 }else {
//				 System.out.println("*");
//			 for(int j=1; j<=9-i; j++) {
//			    System.out.print("*"); 
//			 }
//	   }
		
//Q.13
//		Scanner sc = new Scanner(System.in);
//		Random random = new Random();
//		
//		int lottoAr[] = new int[6];
//		int userAr[] = new int[6];
//		int bonus,bonusUser;
//		int count=0;
//		
//		
//		for(int i=0; i<6; i++) {
//			lottoAr[i] = random.nextInt(45)+1;
//		}
//		bonus= random.nextInt(45)+1;
//		
//		System.out.println("Lotto:"+Arrays.toString(lottoAr)+",bonus:"+bonus);
//		
//		System.out.println("input 6:");
//		for(int i=0; i<6; i++) {
//			userAr[i] = sc.nextInt();
//		}
//		System.out.println("bonus input:");
//		bonusUser = sc.nextInt();
// 
//		System.out.println("User:"+Arrays.toString(userAr)+",bonus:"+bonusUser );
//	   //로또 배열의 값과 사용자의 값 중 같은 값이 몇개 있는지 
//        for(int j=0; j<6; j++) {
//          for(int i=0; i<6; i++) {
//	    	if(lottoAr[0]==userAr[i]) {
//	    		count++;
//	    }
//    }
//	}
//        System.out.println("right count:" + count);
//      if(count==6) {
//        System.out.println("congraturation 1 rank");
//   }
//      else if(count==5) {
//    	  if(bonus==bonusUser) {
//    		  System.out.println("congraturation 2 rank");
//    	  }else {
//    		  System.out.println("congraturation 3 rank");
//          }
//       }else if(count==4) {
//    	   System.out.println("congraturation 4 rank");
//       }else if(count==3) {
//    	   System.out.println("congraturation 5 rank");
//       }
		
//Q.14
//		Scanner sc = new Scanner(System.in);
//		String [] vegitables = {"green onion, onion, chicory, Lettuce"};
//		
//		System.out.println("======taste good Camping side dish=====");
//		System.out.println(Arrays.toString(vegitables));
//		
//		System.out.println("======taste good Camping main dish=====");
//		String meats[]  = new String[4];
//		for(int i=0; i<4; i++) {
//			System.out.print("I bought various meats "+ (i+1) + ":");
//			meats[i] = sc.next();
//		}
//		System.out.println("======Order meats=======");
//		for(String eachMeat: meats) {
//			System.out.println(eachMeat+" ");
//		}
		
//Q15.
		
		
	}  
	
}	

