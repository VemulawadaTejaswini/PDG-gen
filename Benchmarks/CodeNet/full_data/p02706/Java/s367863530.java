import java.util.Scanner;
import java.lang.Math;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),
            m = sc.nextInt();
        int A = 0;
        for(int i=0;i<m;i++){
            A = A + sc.nextInt();
        }
        if(A <= n){
            System.out.print(n-A);
        }else{
            System.out.print(-1);
        }
        
    }
}