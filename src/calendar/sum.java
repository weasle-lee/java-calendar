package calendar;

import java.util.Scanner;

public class sum {
	
	public static void main(String[] args) {
	// 입력받은 값에 최대 일 수 구하기
		Scanner scanner = new Scanner(System.in);
		System.out.println("달을 입력하시오 : ");
		int num = scanner.nextInt();
		
		if(num>12) {
			System.out.println("1~12 까지만 입력하시오");
		}
		
		int[] month = new int[12];
		
		for(int i = 0; i<12; i++) {
			month[i] = i+1;
		}
		
		if(num==4||num==6||num==9||num==11){
			System.out.println(num+"월은 30일 까지 있습니다.");
		}
		else if(num==1||num==3||num==5||num==7||num==8||num==12||num==10){
			System.out.println(num+"월은 31일 까지 있습니다.");
		}
		else if(num==2){
			System.out.println(num+"월은 28일 까지 있습니다.");
		}
		
		
	}

}
