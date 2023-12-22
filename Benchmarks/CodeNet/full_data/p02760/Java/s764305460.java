import java.util.*;

public class Main
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        int A[][] = new int[3][3];
        for(int i = 0;i<3;i++){
            for(int j = 0;j < 3;j++){
                A[i][j] = sc.nextInt();
            }
        }
        int N = sc.nextInt();
        for(int k = 0; k < N; k++){
            int b = sc.nextInt();
            for(int i = 0;i<3;i++){
                for(int j = 0;j < 3;j++){
                    if(b == A[i][j]){
                        A[i][j] = 0;
                    }
                }
            }
        }
        // for(int i = 0;i<3;i++){
        //         System.out.print(A[i][0] + " ");
        //         System.out.print(A[i][1] + " " );
        //         System.out.println(A[i][2]);
        // }
        boolean out = true;
        boolean bingo = false;
        for(int i = 0;i<3;i++){
            out = true;
            for(int j = 0;j < 3;j++){
                if(A[i][j] != 0){
                    out = false;
                    break;
                }
            }
            if(out == true){
                bingo = true;
                break;
            }
        }
        if(A[0][0] == 0 && A[1][1] == 0 && A[2][2] == 0 ||
            A[0][2] == 0 && A[1][1] == 0 && A[2][0] == 0)bingo = true;

        if(bingo){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        sc.close();
    }
}