import java.util.*;

public class Main {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        //＜条件＞
        // 余りは0<余り<値-1である
        // 分子(a)、分母(b)は整数（n以下）である
        
        int count = 0;
        
        for(int a=1; a<=n; a++) {
            for(int b=1; b<=n; b++) {
                int remainder = a % b;
                
                if(remainder >= k) {
                    count++;
                }
            }
        }
        System.out.println(count);
  
    }
}