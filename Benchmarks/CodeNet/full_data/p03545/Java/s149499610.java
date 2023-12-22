import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String numbers = sc.next();
		int A = Integer.valueOf(numbers.substring(0,1));
		int B = Integer.valueOf(numbers.substring(1,2));
		int C = Integer.valueOf(numbers.substring(2,3));
		int D = Integer.valueOf(numbers.substring(3,4));
		sc.close();
		int[] ticket = {B,C,D};
		String[] op = {"000",
		"001",
		"010",
		"011",
		"100",
		"101",
		"110",
		"111"
		};
		for(int i = 0; i < op.length; i++){
          	int ans = A;
			for(int j = 0; j < ticket.length; j++){
				if(op[i].charAt(j) == "0".charAt(0)) { ans -= ticket[j]; }
				if(op[i].charAt(j) == "1".charAt(0)){ ans += ticket[j]; }
				if(j == 2 && ans == 7){
					String out = String.valueOf(A) + printOp(op[i].substring(0, 1)) + String.valueOf(B)
			+ printOp(op[i].substring(1, 2)) + String.valueOf(C) + printOp(op[i].substring(2, 3)) + String.valueOf(D) + "=7";
					System.out.println(out);
					return;
				}
			}
			// System.out.println(ans);
		}
	}

	static String printOp(String op){
		if(op.equals("0")) return "-";
		return "+";
	}

}
