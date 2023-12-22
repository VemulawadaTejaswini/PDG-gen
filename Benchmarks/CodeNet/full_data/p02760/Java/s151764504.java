import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int[][] arr=new int[3][3];
       
       for(int i=0;i<3;i++){
           for(int j=0;j<3;j++)
               arr[i][j]=sc.nextInt();
           System.out.println();
       }
       
       int n=sc.nextInt();
       for(int k=0;k<n;k++){
           int val=sc.nextInt();
           for(int i=0;i<3;i++){
               for(int j=0;j<3;j++)
                    if(val==arr[i][j])
                        arr[i][j]=0;
            }
       }
       if(arr[0][0]==0 && arr[1][1]==0 && arr[2][2]==0)
           System.out.println("Yes");
       else if(arr[0][2]==0 && arr[1][1]==0 && arr[2][0]==0)
           System.out.println("Yes"); 
       
       else if(arr[0][0]==0 && arr[0][1]==0 && arr[0][2]==0)
           System.out.println("Yes");
       else if(arr[1][0]==0 && arr[1][1]==0 && arr[1][2]==0)
           System.out.println("Yes");
       else if(arr[2][0]==0 && arr[2][1]==0 && arr[2][2]==0)
           System.out.println("Yes");
       
       else if(arr[0][0]==0 && arr[1][0]==0 && arr[2][0]==0)
           System.out.println("Yes");
       else if(arr[0][1]==0 && arr[1][1]==0 && arr[2][1]==0)
           System.out.println("Yes");
       else if(arr[0][2]==0 && arr[1][2]==0 && arr[2][2]==0)
           System.out.println("Yes");
       
       else
           System.out.println("No");
    }
}