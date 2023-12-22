import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String S= sc.next();
        String[] SArray = new String[S.length()];
        double K=sc.nextDouble();
        long num=0;
        for (int i = 0; i < S.length(); i++) {
            SArray[i] = String.valueOf(S.charAt(i));
            int a=Integer.parseInt(SArray[i]);
            if(a!=1)num += 5*10000000*100000000+Math.log10(a);
            else num++;
            if(num>K){
                System.out.println(SArray[i]);
                return;
            }
        }
        
    }
}
