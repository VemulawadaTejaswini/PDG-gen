import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int m = scan.nextInt();
    int[] res = new int[n];
    boolean[] bool = new boolean[n];
    int ac = 0;
    for (int i = 0; i < m; i++) {
        int p = scan.nextInt();
        String ap = scan.next();
        if(ap.equals("AC") && !bool[p-1]){
            bool[p-1] = true;
            ac++;
        }else if(!bool[p-1]){
            res[p-1]++;
        }
    }

    long sum = 0;
    for (int i = 0; i < res.length; i++) {
        sum+=res[i];
    }

    System.out.println(ac + " " + sum);
  }
}
