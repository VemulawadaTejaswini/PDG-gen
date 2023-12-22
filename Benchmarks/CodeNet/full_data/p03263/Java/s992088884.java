import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int[][] a = new int[H+1][W+1];
        for(int i=1;i<=H;i++){
            for(int j=1;j<=W;j++) a[i][j]=sc.nextInt();
        }
        int[][] backup = new int[H+1][W+1];
        for(int i=1;i<=H;i++){
            System.arraycopy(a[i],0,backup[i],0,W+1);
        }
        int cnt = 0;
        for(int row=1;row<=H;row++){
            for(int col=1;col<=W-1;col++){
                if(backup[row][col]%2==1){
                    cnt++;
                    backup[row][col]--;
                    backup[row][col+1]++;
                }
            }
        }
        for(int row=1;row<=H-1;row++){
            if(backup[row][W]%2==1){
                cnt++;
                backup[row][W]--;
                backup[row+1][W]++;
            }
        }
        System.out.println(cnt);
        for(int row=1;row<=H;row++){
            for(int col=1;col<=W-1;col++){
                if(a[row][col]%2==1){
                    System.out.print(Integer.toString(row)+" "+Integer.toString(col)+" ");
                    System.out.println(Integer.toString(row)+" "+Integer.toString(col+1)+" ");
                    a[row][col]--;
                    a[row][col+1]++;
                }
            }
        }
        for(int row=1;row<=H-1;row++){
            if(a[row][W]%2==1){
                System.out.print(Integer.toString(row)+" "+Integer.toString(W)+" ");
                System.out.println(Integer.toString(row+1)+" "+Integer.toString(W)+" ");
                a[row][W]--;
                a[row+1][W]++;
            }
        }
    }
}

