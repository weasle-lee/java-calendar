package calendar;

import java.util.Scanner;

public class sum {
	
	public static void main(String[] args) {
		//클라이언트에게 두 수를 입력받고
		//두 수의 합을 계산 후 출력한다.
		int a,b;
		Scanner scanner = new Scanner(System.in);
		
		String s1,s2;
		System.out.println("두 수를 입력하시오 :");
		s1 = scanner.next();
		s2 = scanner.next();
		
		System.out.println(s1+","+s2);
		
		a = Integer.parseInt(s1);
		b = Integer.parseInt(s2);
		System.out.println("두 수의 합은 :"+ (a+b));
	}

}
