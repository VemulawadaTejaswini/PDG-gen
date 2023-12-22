import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int mae = Integer.parseInt(s.substring(0,2));
		int usi = Integer.parseInt(s.substring(2,4));
		String ans;
		if(mae <= 12 && usi <= 12 && mae != 0 && usi != 0){
			ans = "AMBIGUOUS";
		}else if(mae <= 12 && mae != 0){
			ans = "MMYY";
		}else if(usi <= 12 && usi != 0){
			ans = "YYMM";
		}else{
			ans = "NA";
		}
		System.out.print(ans);
	}
}
