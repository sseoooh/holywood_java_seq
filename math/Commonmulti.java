/*
 * 
 * 
 * 매우 중요
 * 
 */ 
  package math;

import java.util.Scanner;
/*
 공배수(公倍數)란 두 개 이상의 자연수의 공통인 배수를 말한다. 
 예를 들어 3과 4의 공배수는 3의 배수이기도 하고 4의 배수이기도 한 수이다. 
 두 수의 공배수 중에서 가장 작은 수를 최소공배수
 Least Common Multi = LCM
 
 최대공약수는 수론에서, 정수들의 공약수(公約數, 영어: common divisor)는 동시에 그들 모두의 약수인 정수다.
 적어도 하나가 0이 아닌 정수들의 최대공약수(最大公約數, 문화어: 련속나눔셈; 영어: greatest common divisor, 약자 GCD)
 는 공약수 가운데 가장 큰 하나다. 다항식이나 환의 원소에 대해서도 정의할 수 있다.
 */
public class Commonmulti {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("최대공약수와 최소공배수를 구할 두 수를 입력하세요");
		int num1 = scan.nextInt(),
			num2 = scan.nextInt(),
			lcm = 0,// 최대공약수,
			gcd =0, // 최소공배수,
			big = 0,
			small=0,
			mok = 0,
			nmg = 0;
		
		while(nmg !=0) {
			if(nmg < small) {
				mok = nmg;
				nmg = small;
				small = mok;
			}
			nmg = nmg % small; // nmg% = small;
		}
		gcd = small;
		
		lcm = (num1 * num2) / gcd;
		System.out.printf("%d, %d ::: 최소공배수: %d & 최대공약수는 %d",num1,num2,lcm,gcd);
		
		
		
		
		
		
			/*if(num1>num2) {
				big = num1;
				small = num2;
			}else {
				big = num2;
				small = num1;
			}
				mok = big/small;
				nmg = big%small;	
		
			if(nmg!=0) {
				for(int i=0;nmg<small;i++) {
					if(small%i==0 && big%i==0 ) {
					
					}
				}
			}
		*/
		/*for(int i=0; i<18; i++) {
			if(i%num2!=0) {
				System.out.println(i);
			}
		}
			
		
		System.out.printf("%d , %d ::: 최대공배수: %d & 최대공약수: %d",num1,num2,lcm);*/
	}
}

