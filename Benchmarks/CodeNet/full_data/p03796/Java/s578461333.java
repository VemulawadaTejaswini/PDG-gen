2. import java.util.*;
3.  
4. public class Main {
5.     public static void main(String[] args){
6. Scanner sc = new Scanner(System.in);
7. int N = sc.nextInt();
8. int i;
9. double pow=1;
10. double ans = 1;
11. for(i = 1; i < N; i++){
12.     pow = pow * i;
13.     double ans = (double)pow % (Math.pow(10.0,9.0)+7.0);
14. }
15. System.out.println((int)ans);
16.  
17.     }
18. }
