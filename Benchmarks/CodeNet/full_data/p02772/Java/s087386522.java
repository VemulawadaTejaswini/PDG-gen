import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a,flag;
        flag=1;
        for(int i=0;i<n;i++){
            a=scan.nextInt();
            if(a%2==0){
                if(a%3==0||a%5==0){
                    flag=1;
                }
                else flag = 0;
                if(flag==0) break;
            }
        }
        if(flag==0) System.out.println("DENIED");
        else System.out.println("APPROVED");
    }
}