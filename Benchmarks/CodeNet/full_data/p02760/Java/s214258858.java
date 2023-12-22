import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int[][] arr = new int[3][3];
        int tmp,n;
        boolean flag;
        flag=false;
        for(int r=0;r<3;r++){
            for(int c=0;c<3;c++){
                arr[r][c]=scan.nextInt();
            }
        }
        n=scan.nextInt();
        for(int i=0;i<n;i++){
            tmp=scan.nextInt();
            for(int r=0;r<3;r++){
                for(int c=0;c<3;c++){
                    if(arr[r][c]==tmp) arr[r][c]=-1;
                }
            }
        }
        for(int r=0;r<3;r++){
            if(arr[r][0]==arr[r][1]&&arr[r][1]==arr[r][2]&&arr[r][2]==-1){
                flag=true;
            }
            if(arr[0][r]==arr[1][r]&&arr[1][r]==arr[2][r]&&arr[2][r]==-1){
                flag=true;
            }
        }
        if(arr[0][0]==arr[1][1]&&arr[1][1]==arr[2][2]&&arr[2][2]==-1){
            flag=true;
        }
        if(arr[2][2]==arr[1][1]&&arr[1][1]==arr[0][0]&&arr[2][2]==-1){
            flag=true;
        }
        if(flag) System.out.println("Yes");
        else System.out.println("No");
    }
}