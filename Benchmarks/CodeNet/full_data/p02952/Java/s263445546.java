import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(answer(n));
    }
    
    public static int answer(int n) {
        int count =0;
        for (int i=1; i<=n; i++) {
            int digits = (int)Math.log10(i)+1; //if 10 or 20
            if(digits%2 != 0) {
                count+=1;
            }
        }
        return count;
    }
}