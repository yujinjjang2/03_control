package edu.kh.control.practice;

import java.util.Scanner;

public class ConditionPractice {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		
		System.out.print("숫자를 한 개 입력하세요 : ");
		int input = sc.nextInt();
		
		String result;
		
		if(input >= 0) {
			if(input % 2 == 0) {
				result = "짝수입니다.";
			} else {
				result = "홀수입니다.";
			}	
		} else {
			result = "양수만 입력해주세요.";
		}
		
		System.out.println(result);
	}
	
	public void practice2() {
		
		System.out.print("국어점수 : ");
		int kor = sc.nextInt();
		
		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		
		System.out.print("영어점수 : ");
		int eng = sc.nextInt();
		
		int sum = kor + math + eng;
		double avg = sum / 3.0;
		
		boolean result = (kor >= 40) && (math >= 40) && (eng >= 40) && (avg >= 60);
		
		if(result == true) {
			System.out.printf("국어 : %d\n수학 : %d\n영어 : %d\n합계 : %d\n평균 : %.1f\n", kor, math, eng, sum, avg);
		}
		
		System.out.println(result ? "축하합니다, 합격입니다!" : "불합격입니다.");
	}

	public void practice3() {
		
		System.out.print("1~12 사이의 정수 입력 : ");
		int input = sc.nextInt();
		
		String result = "";
		
		if(input < 1 || input > 12) {
			result = input + "월은 잘못 입력된 달입니다.";
			System.out.println(result);
		}
		
		switch(input) {
		case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 : result = input + "월은 31일까지 있습니다.";
		System.out.println(result); break;
		case 2 : case 4 : case 6 : case 9 : case 11 : result = input + "월은 30일까지 있습니다."; 
		System.out.println(result);
		}
	}
	
	public void practice4() {
		
		System.out.print("키(m)를 입력해 주세요 : ");
		double height = sc.nextDouble();
		
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double weight = sc.nextDouble();
		
		double bmi = weight / (height * height);
		System.out.println("BMI 지수 : " + bmi);
		String result;
		
		if(bmi < 18.5) {
			result = "저체중";
		} else if(bmi >= 18.5 && bmi < 23) {
			result = "정상체중";
		} else if(bmi >= 23 && bmi < 25) {
			result = "과체중";
		} else if(bmi >= 25 && bmi < 30) {
			result = "비만";
		} else {
			result = "고도 비만";
		}
		
		System.out.println(result);
	}
	
	// 모르는 문제
	public void practice5() {
		
		System.out.print("중간 고사 점수 : ");
		int middleSc = sc.nextInt();
		
		System.out.print("기말 고사 점수 : ");
		int finalSc = sc.nextInt();
		
		System.out.print("과제 점수 : ");
		int homeworkSc = sc.nextInt();
		
		System.out.print("출석 횟수 : ");
		int attendance = sc.nextInt();

		
	}
}
