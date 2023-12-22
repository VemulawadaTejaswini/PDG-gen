import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] stu = new int[n][2];
        for(int i = 0; i < n; i++){
            stu[i][0] = sc.nextInt();
            stu[i][1] = sc.nextInt();
        }
        int[][] cp = new[m][2];
        for(int i = 0; i < n; i++){
            cp[i][0] = sc.nextInt();
            cp[i][1] = sc.nextInt();
        }
        
        for(int i = 0; i < stu.length; i++){
            int min = -1;
            int d = 1_000_000;
            for (int j = 0; j < cp.length; j++) {
                int temp = Math.abs(stu[i][0] - cp[j][0]) + Math.abs(stu[i][1] - cp[j][1]);
                if(d > temp){
                    min = j;
                    d = temp;
                }
            }
            System.out.println(min + 1);
        }
        
    }
}