package arithmetic;

public class Exercise {
public static void main(String[] args) {
	int A=2;  //초기값 initial
	int D=6;  //공차
	int S=A;	//series 
	int N=2; //count
	int AN =0; //term항
	
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
