package edu.kh.control.practice;

import java.util.Scanner;

public class LoopPractice {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		} else {
			for (int i = 1; i <= num; i++) {
				System.out.print(i + " ");
			}
		}
	}
	
	public void practice2() {
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num >= 1) {
			for(int i = num; i >= 1; i--) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
	}
	
	public void practice3() {
		
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		
		int sum = 0;
		
		for(int i = 1; i <= num; i++) {
			if (i == 1) {
				System.out.print(i);
			} else {
				System.out.print(" + " + i);
			}
			sum += i;
		}
		
		System.out.println(" = " + sum);
	}
	
	public void practice4() {
		
		System.out.print("첫 번재 숫자 : ");
		int fn = sc.nextInt();
		
		System.out.print("두 번재 숫자 : ");
		int sn = sc.nextInt();
		
		if(fn < 1 || sn < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요");
		} else {
			if(fn > sn) {
				for(int i = sn; i <= fn; i++) {
					System.out.print(i + " ");
				}
			} else {
				for(int i = fn; i <= sn; i++) {
					System.out.print(i + " ");
				}
			}
		}
	}
	
	public void practice5() {
		
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		System.out.printf("===== %d단 =====\n", num);
		
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", num, i, num * i);
		}
	}
	
	public void practice6() {
		
		System.out.print("숫자 : ");
		int num = sc.nextInt();
	
		int count = 0;
		
		if(num < 2 || num > 9) {
			System.out.println("2~9 사이 숫자만 입력해주세요");
		} else {
			for(int i = num; i <= 9; i++) {
				System.out.printf("===== %d단 =====\n", i);
				for(int j = 1; j <= 9; j++) {
					System.out.printf("%d X %d = %d\n", i, j, i * j);
				}
			}
		}
	}
	
	public void practice7() {
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void practice8() {
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			
			for(int j = 4; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	// 못푼 문제
	public void practice9() {
		
//		System.out.print("정수 입력 : ");
//		int num = sc.nextInt();
//		
//		String str;
//		
//		for(int i = 1; i <= num; i++) {
//			
//			for(int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
	}
	
	// 못푼 문제
	public void practice10() {
		
//		System.out.print("정수 입력 : ");
//		int num = sc.nextInt();
//		
//		for(int i = 1; i <= num; i++) {
//			
//			for(int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		int num2 = num - 1;
//		
//		for(int i = num2; i >= 1; i++) {
//			
//			for(int j = num2; ; j--) {
//				System.out.println("*");
//			}
//		}
	}
	
	// 못푼 문제
	public void practice11() {
		
//		System.out.print("정수 입력 : ");
//		int num = sc.nextInt();
//		
//		int sum = 0;
//		
//		for(int i = 1; i <= num; i++) {
//			
//			for(int j = 1; j <= num ; j += 2) {
//				System.out.print("*");
//				sum++;
//			}
//			System.out.println();
//		}
	}
	
	// 못푼 문제
	public void practice12() {
		
//		System.out.println("정수 입력 : ");
//		int num = sc.nextInt();
			
	}
	
	public void practice13() {
		
		System.out.print("자연수 하나를 입력하세요 : ");
		int num = sc.nextInt();
		
		int count = 0;
		
		if (num <= 0) {
			System.out.println("1부터 입력해주세요.");
		} else {
			for(int i = 1; i <= num; i++) {
				if (i % 2 == 0 || i % 3 == 0) {
					System.out.print(i + " ");
					if(i % 2 == 0 && i % 3 == 0) {
						count++;
					}
				}
			}
			System.out.println();
			System.out.println("count : " + count);
		}
	}

}
