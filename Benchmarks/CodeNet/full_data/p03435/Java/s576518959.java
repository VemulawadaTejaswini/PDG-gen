import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] c = new int[3][3];
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                c[i][j] = sc.nextInt();
            }
        }

        boolean flag = false;
        if(c[0][0] - c[1][0] == c[0][1] - c[1][1] && c[0][1] - c[1][1] == c[0][2] - c[1][2] &&
           c[0][0] - c[2][0] == c[0][1] - c[2][1] && c[0][1] - c[2][1] == c[0][2] - c[2][2])
            flag = true;

        if(flag) System.out.println("Yes");
        else System.out.println("No");
          
    }
}