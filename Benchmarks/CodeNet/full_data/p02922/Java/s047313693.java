import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int answer=1;
        b=b-a;
        a=a-1;
        while(a<=b){
            b=b-a;
            answer++;
        }
        if(b>0){
            answer++;
        }
        System.out.println(0);
    }
    
}