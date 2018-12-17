package arithmetic;

public class Sequence1350 {
	public static void main(String[] args) {
		String res = "";	//답은 항상 맨위에 
		int i = 0, d = 1, sum = 1;
		for(i=1; i<20; i++) {       	//i를 어디에서 증가시키느냐가 포인트다
			d += i;
			sum += d;
			}
		
		res = sum+"";
		System.out.printf(res);
} 
} 
		

