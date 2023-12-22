import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner obj=new Scanner(System.in);
       int N=obj.nextInt();
       int[][] arr=new int[N][2];
       for(int i=0;i<N;i++){
           for(int j=0;j<2;j++){
               arr[i][j]=obj.nextInt();
           }
       }
       int A=0,B=0,total=0;
       int result=0;
       for(int i=0;i<N;i++){
           for(int j=i+1;j<N;j++){
               A=arr[i][0]+arr[j][0];
               B=arr[i][1]+arr[j][1];
               total=A+B;
               result=result+(factorial(total)/(factorial(A)*factorial(B)));              
           }
       }
        System.out.println(result);
       
    }
    public static int factorial(int a){
        int fact=1;
        for(int i=2;i<=a;i++)
                fact=fact*i;
        return fact;
    }
}