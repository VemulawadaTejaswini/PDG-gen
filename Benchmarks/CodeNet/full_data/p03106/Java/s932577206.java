import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int t=Math.min(a, b);
        int count=0;
        int i=0;
        for(i=1;i<=t;i++){
            if(a%i==0&&b%i==0){
                count++;
                if(count==c){
                    break;
                }
            }
        }
        System.out.println(i);
    }
}
