import java.util.*;
public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        sc.close();
        if (S.length() != 3) {
			PrintNo();
			return;
        }
        int anum = 0;
        int bnum = 0;
        for (int i = 0; i < 3; i++) {
	        if (S.substring(i,i+1).equals("A") == false &&
	            S.substring(i,i+1).equals("B") == false ) {
                PrintNo();
                return;
            }
            if (S.substring(i,i+1).equals("A")) {
            	anum++;
                continue;
            }
			bnum++;
        }
        if (anum == 0 || bnum == 0) {
            PrintNo();
            return;
        }
        PrintYes();
        return;
    }
    private static void PrintYes() {
        System.out.println("Yes");
	}
    private static void PrintNo() {
        System.out.println("No");
	}
}