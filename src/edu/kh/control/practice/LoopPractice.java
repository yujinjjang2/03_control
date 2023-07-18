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

}
