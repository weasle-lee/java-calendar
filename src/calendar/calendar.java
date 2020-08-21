package calendar;

import java.util.Scanner;


public class calendar {
	private static final int[] Max_Days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30 ,31};
	public int maxDaysofMonth(int month) {
		return Max_Days[month -1];
	}
	
	public static void main(String[] args) {
	// 입력받은 값에 최대 일 수 구하기
		Scanner scanner = new Scanner(System.in);
		System.out.println("달을 입력하시오 : ");
		calendar cal = new calendar();
		
		int month = scanner.nextInt();
		
		System.out.println(month+"월은"+cal.maxDaysofMonth(month)+" 일 까지 있습니다.");
		
		
	}

}
