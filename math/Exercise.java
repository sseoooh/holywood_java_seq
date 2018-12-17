package math;
import java.util.Scanner;
public class Exercise {
public static void main(String[] args) {
	int target; // 소인수분해의 대상이 되는 입력값
    int i; // 회전수 && 입력값
    int length = 20;
    int cnt = 0; // 소인수 계산 처리 변수
    int[] arr = new int[ length];

   System. out.println( "소인수 분해할 대상 값 입력 :" );
   Scanner scanner = new Scanner(System. in);
    target = scanner.nextInt();

    if ( target < 2)
          return;
    do {
          i = 2; // 위치변수
          while ( target % i != 0)
                i++;
          cnt++;
          arr[ cnt - 1] = i;
          target = target / i;

   } while ( target != 1);
    if ( cnt == 1) {
         System. out.println( "\n소수");
   } else {
          for ( i = 0; i < cnt; i++) {
               System. out.print( "" + arr[ i] + " * ");
         }
   }
}
}