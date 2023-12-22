import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[][] c = new int[3][3];

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                c[i][j] = sc.nextInt();
            }
        }
        int[][] d = new int[3][2];

        for(int i=0; i<3; i++){
            for(int j=0; j<2; j++){
                d[i][j] = c[i][j + 1] - c[i][j];
            }
        }
        if(d[0][0]==d[1][0] && d[1][0]==d[2][0] && d[0][1]==d[1][1] && d[1][1]==d[2][1]){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}