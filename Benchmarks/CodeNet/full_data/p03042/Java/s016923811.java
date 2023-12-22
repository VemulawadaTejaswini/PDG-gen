import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		boolean yymm = true, mmyy = true;
		if(Integer.parseInt(S.substring(0,2)) > 12 || Integer.parseInt(S.substring(0,2)) <= 0)
			mmyy = false;
		if(Integer.parseInt(S.substring(2,4)) > 12 || Integer.parseInt(S.substring(2,4)) <= 0)
			yymm = false;
		if(mmyy)
			System.out.println(yymm ? "AMBIGUOUS" : "MMYY");
		else
			System.out.println(yymm ? "YYMM" : "NA");
	}

}