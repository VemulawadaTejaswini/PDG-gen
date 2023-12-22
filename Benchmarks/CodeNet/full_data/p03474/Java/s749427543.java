import java.util.Scanner;

public class Main {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int A =sc.nextInt();
        int B =sc.nextInt();
        String S =sc.next();
        if (A == 1){
            if (!S.substring(0,1).contains("-") && S.substring(1,2).equals("-") &&!S.substring(2).contains("-")){
                System.out.println("YES");
            }else{
                System.out.println("No");
            }
        }else if(!S.substring(0,A-1).contains("-") && S.substring(A,A+1).equals("-") &&!S.substring(A+1).contains("-")){
            System.out.println("YES");
        }else{
            System.out.println("No");
        }
    }
}