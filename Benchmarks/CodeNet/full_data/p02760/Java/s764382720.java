import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        boolean[][] bl = new boolean[3][];
        int[][] A = new int[3][];
        for(int i=0;i<3;i++){
            bl[i] = new boolean[3];
            A[i] = new int[3];
            Arrays.fill(bl[i], false);
        }
        for(int y=0;y<3;y++){
            for(int x=0;x<3;x++){
                A[y][x] = sc.nextInt();
            }
        }
        int N = sc.nextInt();
        for(int i=0;i<N;i++){
            int b = sc.nextInt();
            for(int y=0;y<3;y++){
                for(int x=0;x<3;x++){
                    if(b == A[y][x]){
                        bl[y][x]=true;
                    }
                }
            }
        }
        boolean okflag = false;
        for(int i=0;i<3;i++){
            if(bl[i][0] == bl[i][1] && bl[i][1] == bl[i][2] && bl[i][1]){
                okflag = true;
            }
            if(bl[0][i] == bl[1][i] && bl[1][i] == bl[2][i] && bl[2][i]){
                okflag = true;
            }
        }
        if(bl[0][0] == bl[1][1] && bl[1][1] == bl[2][2] && bl[2][2]){
            okflag = true;
        }
        if(bl[0][2] == bl[1][1] && bl[1][1] == bl[2][0] && bl[1][1]){
            okflag = true;
        }
        if(okflag){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }

}
