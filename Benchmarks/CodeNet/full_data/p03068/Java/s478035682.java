import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        sc.nextLine();
        String B = sc.next();
        sc.nextLine();
        int C = sc.nextInt(); 
        String cha = B.substring(C-1,C);
        String ans = "";
        
        int n = B.length();
        //System.out.println(n);
        //System.out.println(cha);
               
        for(int i=1;  i <= n ; i++ ){
            if ( B.substring(i-1,i).equals(cha)){
               ans = ans + cha;
            }
            else {
               ans = ans + "*";
            }
            //System.out.println(ans);
        }
        System.out.println(ans);
    }
}