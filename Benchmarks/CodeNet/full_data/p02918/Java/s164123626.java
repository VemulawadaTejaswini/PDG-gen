import java.util.*;

public class Main{

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
        String s = sc.next();
        int count = 0;
        for(int i = 0; i < n; i++){
            if(s.charAt(i) == 'L' && i != 0 && s.charAt(i-1) == 'L') count++;
            else if(s.charAt(i) == 'R' && i != n - 1 && s.charAt(i+1) == 'R') count++;
        }

        System.out.println(Math.min(count + 2 * k, n - 1));

    }

}
