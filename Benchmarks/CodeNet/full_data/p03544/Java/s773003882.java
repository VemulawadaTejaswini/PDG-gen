import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] r = new long[87];
        r[0] = 2;
        r[1] = 1;
        for(int i = 2; i <= 86; i++){
            r[i] = r[i-2] + r[i-1];
        }
        System.out.print(r[n]);
    }
}