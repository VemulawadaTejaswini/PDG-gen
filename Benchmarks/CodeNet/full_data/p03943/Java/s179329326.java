import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //3つのキャンディーパックを２人に分ける
        int a = sc.nextInt(); //キャンディーa
        int b = sc.nextInt(); //キャンディーb
        int c = sc.nextInt(); //キャンディーc
        
        if(a+b=c || b+c=a || a+c=b){
            System.out.println(YES);
        }
        else{
            System.out.println(NO);
        }
    }     
}
