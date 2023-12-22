import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        if(N==1 && M==1){
            System.out.println(1);
        }else if(N==1 && M!=1){
            System.out.println(M-2);
        }else{
            // 端の2行を除いたN-2行*端の2個を除いたM-2列
            System.out.println((N-2)*(M-2));
        }

    }
}
