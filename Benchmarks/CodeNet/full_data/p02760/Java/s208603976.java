import java.util.*;

class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[3][3];
        int[][] an = new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                a[i][j] = sc.nextInt();
                an[i][j] = 0;
            }
        }
        int n = sc.nextInt();
        for(int k=0;k<n;k++){
            int tmp = sc.nextInt();
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    if(tmp==a[i][j]){
                        an[i][j] = 1;
                    }
                }
            }
        }

        // for(int i=0;i<3;i++){
        //     for(int j=0;j<3;j++){
        //         System.out.print(an[i][j]);
        //     }
        //     System.out.println();
        // }

        

        // たて
        for(int i=0;i<3;i++){
            if(an[i][0]==1 && an[i][1]==1 && an[i][2]==1){
                System.out.print("Yes");
                return;
            }
        }

        // よこ
        for(int i=0;i<3;i++){
            if(an[0][i]==1 && an[1][i]==1 && an[2][i]==1){
                System.out.print("Yes");
                return;
            }
        }

        if(an[0][0]==1 && an[1][1]==1 && an[2][2]==1){
            System.out.print("Yes");
            return;
        }
        if(an[0][2]==1 && an[1][1]==1 && an[2][0]==1){
            System.out.print("Yes");
            return;
        }
        System.out.print("No");
    }
}
