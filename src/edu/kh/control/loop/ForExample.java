package edu.kh.control.loop;

import java.util.Scanner;

public class ForExample {
	
	/* for문
	 * - 끝이 정해져 있는(횟수가 지정되어 있는) 반복문
	 * 
	 * [작성법] 
	 * 
	 * for(초기식; 조건식; 증감식) {
	 * 		반복 수행할 코드
	 * }
	 * 
	 * - 초기식 : for문을 제어하는 용도의 변수 선언
	 * 
	 * - 조건식 : for문의 반복 여부를 지정하는 식.
	 * 			 보통 초기식에 사용된 변수를 이용하여 조건식을 작성함.
	 * 
	 * - 증감식 : 초기식에 사용된 변수를
	 * 			 for문이 끝날 때 마다 증가 또는 감소시켜
	 * 			 조건식의 결과를 변하게 하는 식
	 */
	
	
	public void ex1() {
		// for 문 기초 사용법1
		// 1~10 출력하기
		// 1부터 10까지 1씩 증가하며 출력
		
		// * 반복문은 조건식이 true 일 때만 반복한다
		
		for(int i = 1;  i <= 10;   i++) {
			// 초기식  // 조건식   //증감식
			
			// 반복 수행할 코드
			System.out.println(i);
		}
		
	}
	
	public void ex2() {
		// 3에서 7까지 1씩 증가하며 출력
		// 3 4 5 6 7
		
		for(int i = 3; i <= 7; i++) {
			System.out.println(i);
		}
	}
	
	public void ex3() {
		// 2부터 15 까지 1씩 증가하며 출력
		// 2 3 4 5 ... 14 15
		for(int i= 2; i <= 15; i++) {
			System.out.println(i);
		}
		
	}
	
	public void ex4() {
		// 1부터 입력받은 수까지 1씩 증가하며 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 번호 : ");
		int input = sc.nextInt();
		
		for(int i = 1; i <= input; i++) {
			System.out.println(i);
		}
	}
	
	public void ex5() {
		// 1부터 입력받은 수까지 2씩 증가하며 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 번호 : ");
		int input = sc.nextInt();
		
		for(int i = 1; i <= input; i += 2) { //i=i+2
			System.out.println(i);
		}
	}
	
	public void ex6() {
		// 1.0부터 입력 받은 실수 까지 0.5씩 증가하며 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 번호 : ");
		double input = sc.nextDouble();
		
		for(double i = 1.0; i <= input; i += 0.5) {
			System.out.println(i);
		}
	}
	
	public void ex7() {
		// 영어 알파벳 A 부터 Z 까지 한줄로 출력
		// ABCDEF...Z
		
		// * char 자료형은 문자형이지만 실제로 정수(문자표 번호)를 저장한다
		
		for(int i = 'A'; i <= 'Z'; i++) {
			System.out.print( (char)i ); // 강제형변환, ABCDEFGHIJKLMNOPQRSTUVWXYZ
		}
		
		System.out.println("\n-------------------------------------");
		
		for(char i = 'A'; i <= 'Z'; i++) {
			System.out.print(i); // ABCDEFGHIJKLMNOPQRSTUVWXYZ
		}
	}
	
	public void ex8() {
		// 10에서 1까지 1씩 감소하며 출력
		
		for(int i = 10; i >= 1; i--) {
			System.out.println(i);
		}
	}
	
	public void ex9() {
		
		// for문 응용 1 : 반복문을 이용한 값의 누적
		
		// 1부터 10까지 모든 정수의 합 구하기
		
		int sum = 0; // 반복되어 증가되는 i값의 합계를 저장할 변수 
					 // 0으로 시작하는 이유 : 아무것도 더하지 않음으로
				     // 정확히 결과를 도출할 수 있기 때문
		
		for(int i = 1; i <= 10; i++) {
			
			// sum = sum + i;
			sum += i;
			// 0 = 0 + 1
			// 1 = 1 + 1...
		}
		
		System.out.println("합계 : " + sum); // 합계 : 55
		
	}
	
	public void ex10() {
		// for문 응용 2 : 정수 5개를 입력 받아서 합계 구하기
		
		// ex)
		// 입력 1 : 10
		// 입력 2 : 20
		// 입력 3 : 30
		// 입력 4 : 40
		// 입력 5 : 50
		// 합계 : 150
		
		/*Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 1 : ");
		int input1 = sc.nextInt();
		
		System.out.print("입력 2 : ");
		int input2 = sc.nextInt();
		
		System.out.print("입력 3 : ");
		int input3 = sc.nextInt();
		
		System.out.print("입력 4 : ");
		int input4 = sc.nextInt();
		
		System.out.print("입력 5 : ");
		int input5 = sc.nextInt();
		
		int result = input1 + input2 + input3 + input4 + input5;
		
		System.out.printf("합계 : %d\n", result);*/
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		
		for(int i = 1; i <= 5; i++) {
			System.out.print("입력" + i + " : ");
			int input = sc.nextInt();
			
			sum+= input; // sum에 입력받은 input값 누적
		}
		
		System.out.println("합계 : " + sum);
		
	}
	
	public void ex11() {
		// 정수를 몇 번 입력 받을지 먼저 입력 받고
		// 입력된 정수의 합계를 출력
		
		// ex)
		// 입력 받을 정수의 개수 : 3
		// 입력 1 : 10
		// 입력 2 : 20
		// 입력 3 : 30
		// 합계 : 60
		
		// ex)
		// 입력 받을 정수의 개수 : 2
		// 입력 1 : 10
		// 입력 2 : 20
		// 합계 : 30
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 받을 정수의 개수 : ");
		int num = sc.nextInt();
		
		int sum = 0;
		
		for(int i = 1; i <= num; i++) {
			System.out.print("입력" + i + " : ");
			int input = sc.nextInt();
			
			sum += input;
		}
		
		System.out.println("합계 : " + sum);
		
		
	}
	
	public void ex12() {
		// 1부터 20까지 1씩 증가하면서 출력
		// 단, 5의 배수 () 를 붙여서 출력
		// ex) 1 2 3 4 (5) 6 7 8 9 (10) 11 ... (20)
		
		for(int i = 1; i <= 20; i++) {
			
			if (i % 5 == 0) {
				System.out.print("(" + i + ") ");
			} else {
				System.out.print(i + " "); // 1 2 3 4 (5) 6 7 8 9 (10) 11 12 13 14 (15) 16 17 18 19 (20) 
			}
		}
	}
	
	public void ex13() {
		// 1부터 20까지 1씩 증가하면서 출력
		// 단, 입력 받은 수의 배수는 () 표시
		
		// ex)
		// 괄호를 표시할 배수 : 3
		// 1 2 (3) 4 5 (6) ...
		
		// 괄호를 표시할 배수 : 4
		// 1 2 3 (4) 5 6 7 (8) 9 ...
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("괄호를 표시할 배수 : ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= 20; i++) {
			
			if (i % num == 0) {
				System.out.print("(" + i + ") ");
			} else {
				System.out.print(i + " ");
			}
		}
	}
	
	public void ex14() {
		
		// [구구단 출력]
		// 2 ~ 9 사이 수를 하나 입력받아
		// 해당 단을 출력
		// 단, 입력받은 수가 2~9 사이 숫자가 아니면 "잘못 입력 하셨습니다" 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("단 입력 : ");
		int dan = sc.nextInt();
		
		if(dan >= 2 && dan <= 9) { // dan이 2~9 사이
			
			for(int i = 1; i <= 9; i++) {
				System.out.printf("%d X %d = %d\n", dan, i, dan * i);
			}
			
		} else {
			System.out.println("잘못 입력 하셨습니다.");
		}
	}
	
	public void ex15() {
		// [19단 출력기]
		// 2 ~ 19단 사이 단을 입력 받아서 x 1 ~ x 19까지 출력
		// 단, 2 ~ 19 사이 단이 입력되지 않으면 "잘못 입력 하셨습니다." 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("단 입력 : ");
		int dan = sc.nextInt();
		
		if(dan >=2 && dan <= 19) {
			for (int i = 1; i <= 19; i++) {
				System.out.printf("%d X %d = %d\n", dan, i, dan * i);
			}
			
		} else {
			System.out.println("잘못 입력 하셨습니다.");
		}
	}
	
	// ** 중첩반복문 **
	public void ex16() {
		// 구구단 모두 출력하기
		
		for(int dan = 2; dan <= 9; dan++) { // 2 ~ 9 단까지 차례대로 증가
			
			for(int num = 1; num <=9; num++) { // 각 단에 곱해질 수 1~9까지 차례대로 증가
				
				System.out.printf("%2d X %2d = %2d  ", dan, num, dan * num);

			}
			
			System.out.println(); // 하나의 단 출력이 끝났을 때 줄바꿈
			// 아무내용 없는 println() == 줄바꿈
		}

	}
	
	public void ex17() {
		// 구구단 역순 출력
		// 9단 -> 2단까지 역방향
		// 곱해지는 수는 1 -> 9 정방향
		
		for(int dan = 9; dan >= 2; dan--) { // 단 9 -> 2 역
			
			for(int num = 1; num <= 9; num++) { // 수 1 -> 9 정
				
				System.out.printf("%2d X %2d = %2d  ", dan, num, dan * num);
			}
			
			// 한단 출력 종료시점에 줄바꿈
			System.out.println();
		}
		
	}
	
	public void ex18() {
		// 2중 for 문을 이용해서 다음 모양을 출력하시오
		
		// 12345
		// 12345
		// 12345
		// 12345
		// 12345
		
		for(int i = 1; i <= 5; i++) { // 5바퀴 반복하는 for문
			
			for(int j = 1; j <= 5; j++) { // 12345 한 줄 출력하는 for문
				System.out.print(j);
			}
			
			System.out.println();
		}
		
		System.out.println("-----------------------------------");
		
		// 54321
		// 54321
		// 54321
		
		for(int i = 1; i <= 3; i++) {
			
			for(int j = 5; j >= 1; j--) {
				System.out.print(j);
			}
			
			System.out.println();
		}
	}
	
	public void ex19() {
		// 2중 for문을 이용하여 다음 모양을 출력하시오.
		
		// 1
		// 12
		// 123
		// 1234
		
		// 현재 바퀴수와 마지막 찍히는 수가 똑같다(Hint)
		
		for(int i = 1; i <= 4; i++) { // 줄반복
			
			for(int j = 1; j <= i; j++) { // 출력반복
				System.out.print(j);
			}
			
			System.out.println();
		}
		
		System.out.println("--------------------------------------");
		
		// 4321
		// 321
		// 21
		// 1
		
		for(int x = 4; x >= 1; x--) { // 줄반복
			
			for(int i = x; i >= 1; i--) {
				System.out.print(i);
			}
			
			System.out.println();
		}
		
	}
	
	public void ex20() {
		// 숫자세기 count
		
		// 1부터 20까지 1씩 증가하면서
		// 3의 배수의 총 개수 출력
		// 3의 배수의 합계 출력
		
		// 3 6 9 12 15 18 : 6개
		// 3의 배수 합계 : 63
		
		int count = 0; // 3의 배수의 개수를 세기 위한 변수
		int sum = 0; // 3의 배수의 합계를 구하기 위한 변수
		
		for(int i = 1; i <= 20; i++) {
			
			if( i % 3 == 0 ) {
				System.out.print(i + " ");
				count++; // 3의 배수일 때마다 카운트 누적
				sum += i; // 3의 배수일 때마다 합계 누적
			}
		}
		
		System.out.println(": " + count + "개");
		System.out.println("3의 배수 합계 : " + sum);
		
	}
	
	public void ex21() {
		
		// 2중 for문과 count를 이용해서 아래모양 출력하기
		
		// 1  2  3  4
		// 5  6  7  8
		// 9 10 11 12
		
		int count = 1;
		
		for(int x = 1; x <= 3; x++) { // 3줄
			
			for(int i = 1; i <= 4 ; i++) { // 4칸
				
				System.out.printf("%3d", count);
				count++;
			}
			
			System.out.println();
		}
	}
	
	public void ex22() {
		
		for(int i = 1; i <= 9; i++) {
			
			for(int j = 2; j <= 9; j++) {
				System.out.printf("%-2d X %-2d = %-2d      ", j, i, j * i);
			}
			
			System.out.println();
		}
		
	}
	


}
