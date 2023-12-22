import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int[] memo = new int[1000000];
        calc(S, 1, memo);
    }

    public static void calc(int s, int index, int[] memo) {
        
          if (s == 4 || s==2 || s==1) {
                System.out.println(index+3);
                return;
            }
       
		int result = 0;
        if (s % 2 == 0){
            result = s/2;
        }        
        else {
            result = s*3 + 1;
        }
        calc(result, index+1, memo);
    }
}