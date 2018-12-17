package array;

import java.util.Scanner;

public class MyClass2 {
	public static void main(String[] args) {
		
		String[] vivace = {"은지","지우","창준","현일","서우"};
		String[] royal = {"창하","수호","은영","정욱"," "};
		String[] atlas = {"동준","종협","이레","지은"," "};
		String[] ntom = {"정우","기호","태혁","승하"," "};
		
		String[] res = {};
		
		System.out.println("팀명을 입력하세요");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		
		switch(name) {
		case "vivace" :	res = vivace; break;
		case "royal" :	res = royal; break;
		case "atlas" :	res = atlas; break;
		case "ntom" :	res = ntom; break;
		}
				
				
	for(int i=0;i<res.length;i++) {
		System.out.println(res[i]);
	}
	}
}