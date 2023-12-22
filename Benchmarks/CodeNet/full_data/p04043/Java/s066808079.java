import java.util.*;
class Main{
    public static void main(String[] args){
Scanner in = new Scanner(System.in);
       int a = in.nextInt();
       int b = in.nextInt();
       int c = in.nextInt();
       
       if (a == 5 || a==7 || b == 5 || b == 7 || c == 5 || c == 7)
           if (a + b + c == 17)
                System.out.printf("YES");
            else
                System.out.printf("NO");
       else
            System.out.printf("NO");
       
       
               
    }
    
}