package geometric;
/*
 1-2+3-4+5-6+7-8.... 1부터 20까지
 */
public class Switch10 {
	public static void main(String[] args) {
		int res =0;
		for(int i = 0; i<21; i++) {
			
		
			res += (i%2!=0) ? i : -i; //3항 연산자
			
			
		}
		System.out.println(res);
		/*
		if(i%2!=0){
		res = res+i						res+=	(i%2!=0) ? i : -i
		}else{
		res = res-i
		}
		
		*/
	}
}
