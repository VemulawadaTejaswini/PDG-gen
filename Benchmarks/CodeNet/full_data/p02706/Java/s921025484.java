import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int m=scan.nextInt();

        long cnt=0;
        for(int i=0;i<m;i++){
            cnt+=scan.nextLong();
        }
        if(n-cnt>-1) System.out.println(n-cnt);
        else System.out.println(-1);
    }
}