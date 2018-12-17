package arithmetic;									// 1.식분석 2. 카운트 숫자변경가능생각하자
/**
Count is 2, Number is 8, Sum is 10
Count is 3, Number is 14, Sum is 24
Count is 4, Number is 20, Sum is 44
Count is 5, Number is 26, Sum is 70
Count is 6, Number is 32, Sum is 102
Count is 7, Number is 38, Sum is 140
Count is 8, Number is 44, Sum is 184
Count is 9, Number is 50, Sum is 234
Count is 10, Number is 56, Sum is 290
// 중간 생략
Count is 198, Number is 1184, Sum is 117414
Count is 199, Number is 1190, Sum is 118604
Count is 200, Number is 1196, Sum is 119800
S is 119800
 * */
public class Sequence119800 {
	public static void main(String[] args) {
		int A = 2;	//init 초기값
        int D = 6;	//diff	공차						number구하는 식 : 초기값+(카운트-1)*공차
        int S = A;	//series 결과
        int N = 2;	// count는 무조건 1부터 
        int AN = 0;	//term 항 (
        
        while(true) {
    		
    		AN = A+(N-1)*D;
    		S += AN;
    		System.out.printf("Count is %d  Number is %d  Sum is %d\n",N,AN,S);
    		N++;
    		if(N==201) {
    			break;
    		}
    		
    	}
    	System.out.printf("S is %d",S);
    }
    }
               
        /*N = N-1;				N카운트이 변화를 잘봐라
        while(true){
           
            N++; // 1뺏기때문에 1다시증가 count=2
            AN = A + (N-1)*D;
            S += AN;
            
            System.out.printf("Count is %d, Number is %d, Sum is %d\n", (N-1),AN,S);
            if(N==11) {
            							//if에서는 멈추는게 return, continue, break, 여기에 return넣으면 Sysout날라감
            	break;
            }
        }
        System.out.printf("S is %d", S);
		
	}
}
*/
