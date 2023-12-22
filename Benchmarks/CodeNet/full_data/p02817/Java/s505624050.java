    import java.util.*;
     
    class Main{
        //149a
        static final int DIV = 100000007;
        static final int MAX = 2000000000;
        static long[] num = new long[20];
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            String a = sc.next();
            String b = sc.next();
            b += a;
            
            sc.close();
            System.out.println(b);    
        }
        
    }