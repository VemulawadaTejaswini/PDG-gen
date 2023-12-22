import java.util.*;

public class Main {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        String S = sc.next();
        

        while(!(((S.indexOf("#", A) == A+1 )&&(A+1 == B))|((S.indexOf("#", A) == A)&&(A+2 == B))) && (A != C)){
            if((S.indexOf(".", A) == A) && (S.indexOf(".", A) == A+1)){
                A += 2;
            }else if((S.indexOf(".", A) == A) && !(S.indexOf(".", A) == A+1)){
                A += 1;
            }
//            A += (int)(Math.random()*2+1);
        }

        while(!(((S.indexOf("#", B) == B+1 )&&(B+1 == A))|((S.indexOf("#", B) == B)&&(B+2 == A))) && (B != D)){
            if((S.indexOf(".", B) == B) && (S.indexOf(".", B) == B+1)){
                B += 2;
            }else if((S.indexOf(".", B) == B) && !(S.indexOf(".", B) == B+1)){
                B += 1;
            }
        }

        if((N == S.length()) && (A == C) && (B == D)){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }
}

