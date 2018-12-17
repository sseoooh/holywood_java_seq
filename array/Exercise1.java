package array;

public class Exercise1 {
public static void main(String[] args) {
	

	String[] vivace = {"은지","지우","창준","현일","서우"};
	String[] royal = {"창하","수호","은영","정욱"," "};
	String[] atlas = {"동준","종협","이레","지은"," "};
	String[] ntom = {"정우","기호","태혁","승하"," "};
	String[][] all = {vivace, royal, atlas, ntom};
	String[] res = new String[4];
	
		for(int i=0;i<all.length;i++) {
			for(int j=0;j<1;j++) {
				res[i] = all[i][j]; 
			
			}
		
		}
		for(int i=0;i<all.length;i++) {
			System.out.println(res[i]);
	}
	
	
	
}
}
