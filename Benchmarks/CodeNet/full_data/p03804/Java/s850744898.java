
import java.util.Scanner;

public class Main {

    public static void main(String args[]) throws Exception {
        Scanner Input = new Scanner(System.in);

        int N = Input.nextInt();
        int M = Input.nextInt();

        char A[][] = new char[N][N];
        char B[][] = new char[M][M];

        String S = "";
        String SS = "";
        //System.out.println("AAAAA");
        for (int I = 0; I < A.length; I++) {
            S = Input.next();
            for (int J = 0; J < A[0].length; J++) {
                A[I][J] = S.charAt(J);
                //System.out.print(A[I][J]);
            }
            //System.out.println("");
        }
        for (int I = 0; I < B.length; I++) {
            S = Input.next();
            for (int J = 0; J < B[0].length; J++) {
                B[I][J] = S.charAt(J);
                //System.out.print(B[I][J]);
            }
            //System.out.println("");
        }

        int Rurse = 0;
        int Durse = 0;
        int Curse = 0;
        boolean T=false;
        while ((Rurse != N - M && Durse != N - M) && Curse != M) {
            for (int I = 0; I < B.length; I++) {
                for (int J = 0; J < B[0].length; J++) {
                    if (A[I + Rurse][J + Durse] == B[I][J]) {
                        Curse++;
                        if (Curse == M) {
                            System.out.println("Yes");
                            T=true;
                            break;
                        }
                    } else if (A[I][J] != B[I][J]) {
                        Curse = 0;
                    }
                }
            }
            Durse++;
            if (Durse == N - M) {
                Durse=0;
                Rurse++;
            }
        }
        if(!T)System.out.println("No");
    }

}