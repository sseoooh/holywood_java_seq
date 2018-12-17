package math;

import java.util.Random;
/*
 <문제>
 1개 반의 학생의 몸무게를 측정하였다.
 - 각 반의 학생수는 30명이다.
 - 각 반의 학생의 몸무게의 최대, 최소값을 구하시오.
 - 단, 몸무게는 40 ~ 100사이에서만 랜덤으로 생성시키시오
 */
public class MaxMin {
	public static void main(String[] args) {
	Random random = new Random();
	int max = 40, min = 100;
	int[] a = new int[30];
	
		for(int i=0;i<a.length;i++) {
			a[i] = random.nextInt(61)+40;	
			if(a[i]>=max) {
				max = a[i];
			}
			if(a[i]<=min) {
				min = a[i];
			}
		}
		System.out.printf("1반의 최대몸무게는 %d 최저몸무게는 %d 입니다",max,min);
	}
	}

