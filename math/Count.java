package math;

import java.util.Random;
/*
<문제>

영어 시험 성적이 80점 이상인 학생들의 수를 구하는 알고리즘을 제시하라.
- 전체 학생의 수는 100명이다.
- 영어 점수는 100점 만점을 기준으로 채점되었다.
- 영어 점수는 배열 변수 JUMSU(100)에 이미 저장되어 있다고 가정한다.
 */
public class Count {
	public static void main(String[] args) {
	int[] jumsu = new int[100];
	Random random = new Random();
	
	int count = 0;
	for(int i=0; i<jumsu.length;i++) {
		jumsu[i] = random.nextInt(101);
		
		
	}
	for(int i=0; i<jumsu.length;i++) {
		if(jumsu[i]>=80) {
			System.out.println(i);
		count++;
		}
	}
	System.out.printf("영어 시험 성적이 80점 이상인 학생들이 수는 %d다", count);
		
	}
	
}
			
		
		//System.out.printf("영어 시험 성적이 80점 이상인 학생들의 수는 %d명이다",count);	
			
		
		

