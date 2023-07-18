package edu.kh.control.condition;

import java.util.Scanner;

public class ConditionExample {
	
	//Scanner sc = new Scanner(System.in);
	//클래스 레벨인 전역에 적어주면 매 매소드마다 Scanner 적지 않아도 됨
	//하단 메소드들이 sc 다 가져다 쓸 수 있음

	public void ex1() {
		
		// if문
		// 조건식이 true 일때만 내부 코드 수행
		
		/*
		 * [작성법]
		 * if(조건식) {
		 * 		조건식이 true 일 때 수행할 코드
		 * }
		 * 
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		// 입력된 정수가 양수인지 검사
		if(input > 0) {
			System.out.println("양수입니다");
		}
		
		if(input <= 0) {
			System.out.println("양수가 아니다.");
		}	
	}
	
	
	public void ex2() {
		
		// if - else 문
		// 조건식 결과가 true면 if문,
		// false면 else 구문이 수행됨.
		
		/*
		 * if(조건식) {
		 * 		조건식이 true일 때 수행될 코드
		 * } else {
		 * 		조건식이 false일 때 수행될 코드
		 * }
		 * 
		 * 
		 *
		 */
		
		Scanner sc = new Scanner(System.in);
		
		// 홀짝 검사
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		if( input % 2 != 0 ) {
			System.out.println("홀수 입니다.");
			
		} else { // 짝수 또는 0 입력 시 수행
			
			// 중첩 if문
			if(input == 0) {
				System.out.println("0 입니다.");
			} else {
				System.out.println("짝수 입니다.");
			}
			
		}
		
		
		
	}
	
	
	public void ex3() {
		
		// 양수, 음수, 0 판별
		
		// if - else if - else
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		if(input > 0) { // input이 양수일 경우
			System.out.println("양수 입니다.");
			
		} else if(input < 0) { // input이 음수일 경우
			// 바로 위에있는 if문이 만족되지 않은 경우 수행
			System.out.println("음수 입니다.");
			
		} else {
			System.out.println("0 입니다.");
			
		}
		
		
		
	}
	
	
	public void ex4() {
		
		// 달(month)을 입력받아 해당 달에 맞는 계절 출력
		// 단, 겨울일때 온도가 -15도 이하 "한파 경보", -12이하 "한파 주의보"
		// 여름일때 온도가 35도 이상 "폭염 경보", 33도 이상 "폭염 주의보"
		// 1~12 사이가 아닐땐 "해당하는 계절이 없습니다" 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("달 입력 : ");
		int month = sc.nextInt();
		
		int temperature = 34;
		
		String season; // 아래 조건문 수행 결과를 저장할 변수 선언
		
		if(month == 1 || month == 2 || month == 12) {
			season = "겨울";
			
			if(temperature <= -15) {
				//season = "겨울 한파 경보";
				season += " 한파 경보";
				// season = season + " 한파 경보"
			} else if(temperature <= -12) {
				season += " 한파 주의보";
			}
			
			
		} else if(month >=3 && month <= 5) {
			season = "봄";
		} else if(month >=6 && month <= 8) {
			season = "여름";
			
			if(temperature >= 35) {
				season += " 폭염 경보";
			} else if(temperature >= 33) {
				season += " 폭염 주의보";
			}
			
			
		} else if(month >=9 && month <= 11) {
			season = "가을";
		} else {
			season = "해당하는 계절이 없습니다.";
		}
		
		System.out.println(season);
	}
	
	
	public void ex5() {
		
		/*Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		if(age <= 13) {
			System.out.println("어린이 입니다.");
		} else if(age > 13 && age <= 19) {
			System.out.println("청소년 입니다.");
		} else {
			System.out.println("성인 입니다.");
		}*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		
		if(age <= 13) {
			System.out.println("어린이 입니다.");
			
		} else if(age > 19) {
			System.out.println("성인입니다.");
			
		} else {
			System.out.println("청소년 입니다.");
			
		}
	}
	
	
	public void ex6() {
		
		/*Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 : ");
		int score = sc.nextInt();
		
		if(score >= 90 && score <= 100) {
			System.out.println("A");
		} else if (score >= 80 && score < 90) {
			System.out.println("B");
		} else if (score >= 70 && score < 80) {
			System.out.println("C");
		} else if (score >= 60 && score < 70) {
			System.out.println("D");
		} else if (score < 60 && score >= 0) {
			System.out.println("F");
		} else {
			System.out.println("잘못 입력하셨습니다");
		}*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 입력(0~100) : ");
		int score = sc.nextInt();
		
		String result;
		
		if(score < 0 || score > 100) {
			result = "잘못 입력하셨습니다!";
			
		} else if(score >= 90) {
			result = "A";
			
		} else if(score >= 80) {
			result = "B";
			
		} else if(score >= 70) {
			result = "C";
			
		} else if(score >= 60) {
			result = "D";
			
		} else {
			result = "F";
		}
		
		System.out.println(result);
		
	}
	
	public void ex7() {
		
		 /*Scanner sc = new Scanner(System.in);
		 
		 System.out.print("나이 : ");
		 int age = sc.nextInt();
		 
		 System.out.print("키 : ");
		 double height = sc.nextDouble();
		 
		  if(age >= 12 && age <= 100) {
			 if(height >= 140) {
				 System.out.println("탑승 가능");
			 } else {
				 System.out.println("적정 키가 아닙니다.");
			 }
		  } else if(age < 12 && age >= 0) {
			  System.out.println("적정 연령이 아닙니다.");
		  } else {
			  System.out.println("잘못 입력 하셨습니다.");
		  }*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		
		String result;
		
		if(age < 0 || age > 100) {
			result = "잘못 입력하셨습니다!";
			
		} else {
			System.out.print("키 입력 : ");
			double height = sc.nextDouble();
			
			if (age < 12) {
				result = "적정 연령이 아닙니다";
				
			} else if(height < 140.0) {
				result = "적정 키가 아닙니다";
				
			} else {
				result = "탑승 가능";
				
			}
		}
		
		System.out.println(result);
		
		
	}
	
	
	public void ex8() {
		
		/*Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		if(age < 0 || age > 100) {
			System.out.println("나이를 잘못 입력 하셨습니다.");
			return;
		}
		
		System.out.print("키 : ");
		double height = sc.nextInt();
		
		if(height < 0 || height > 250.0) {
			System.out.println("키를 잘못 입력 하셨습니다.");
			return;
		}
		
		if(age >= 12) {
			if(height >= 140.0) {
				System.out.println("탑승 가능");
			} else {
				System.out.println("나이는 적절하나, 키가 적절치 않음");
			}
		} else if(age < 12) {
			if(height >= 140.0) {
				System.out.println("키는 적절하나, 나이는 적절치 않음");
			} else {
				System.out.println("나이와 키 모두 적절치 않음");
			}
		}*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		
		String result;
		
		if(age < 0 || age > 100) {
			result = "나이를 잘못 입력하셨습니다.";
			
		} else {
			
			System.out.print("키 입력 : ");
			double height = sc.nextDouble();
			
			if(height < 0 || height > 250) {
				result = "키를 잘못 입력하셨습니다.";
				
			} else {
				
				if(age < 12 && height >= 140.0) { // 나이 X, 키 O
					result = "키는 적절하나, 나이가 적절치 않음";
					
				} else if(age >= 12 && height < 140.0) { // 나이 O, 키 x
					result = "나이는 적절하나, 키가 적절치 않음";
					
				} else if(age < 12 && height < 140.0) { // 나이 x, 키 x
					result = "나이와 키 모두 적절치 않음";
					
				} else { // 나이 O, 키 O
					result = "탑승 가능";
					
				}
				
			}
		}
		System.out.println(result);
		
	}
}