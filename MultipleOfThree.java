package homework;

import java.util.Scanner;

public class MultipleOfThree {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
       System.out.print("수를 입력하시오:");
       int number = in.nextInt();
       
       if(number % 3 == 0)  // number를 3으로 나눈 나머지가 0인 경우 아래 명령 실행
    	   System.out.println("3의 배수입니다.");
       else // number를 3으로 나눈 나머지가 0이 아닌 경우 아래 명령 실행 
    	   System.out.println("3의 배수가 아닙니다.");
       
       in.close();
	}
}
