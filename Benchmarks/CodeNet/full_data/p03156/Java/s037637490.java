import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N= scan.nextInt();
        int A = scan.nextInt();
        int B = scan.nextInt();
        int P = 0;
        int Q1 = 0;
        int Q2 = 0;
        int Q3 = 0;

        for(int i = 0; i < N; i++){
            P = scan.nextInt();
            if( P <= A) {
                Q1++;
            }else if(P >= A + 1 && P <= B){
                Q2++;
            }else if(P >= B + 1){
                Q3++;
            } else {
                //nothing
            }
        }
        scan.close();

        if(Q1 <= Q2 && Q1 <= Q3){
            System.out.println(Q1);
        }else if(Q2 <= Q1 && Q2 <= Q3){
            System.out.println(Q2);
        }else if(Q3 <= Q1 && Q3 <= Q2){
            System.out.println(Q3);
        }

    }
}