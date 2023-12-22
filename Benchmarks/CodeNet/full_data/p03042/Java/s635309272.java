import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int S = sc.nextInt();
    int[] yOrM = new int[2];
    String[] yymm = {"", ""};
    String ans = "";

    yOrM[0] = S / 100;
    yOrM[1] = S % 100;

    for(int i = 0; i < 2; i++) {
    	if(yOrM[i] <= 12 && yOrM[i] >= 1) {
        	yymm[i] = "MM";
        }
        else if(yOrM[i] > 12 || yOrM[i] == 0) {
        	yymm[i] = "YY";
        } else {
        	yymm[i] = "NA";
        }
    }

    ans = yymm[0] + yymm[1];

    if(ans.equals("MMMM")) {
    	ans = "AMBIGUOUS";
    }
    else if(ans.indexOf("NA") != -1 || ans.equals("YYYY")) {
    	ans = "NA";
    }

    System.out.println(ans);
  }
}
