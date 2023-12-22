
import java.util.Scanner;

public class Main {
    
    static int [] num = new int[3];
    
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        do{
            System.out.println("1つ目の数字を入力してください");
            num[0] = stdIn.nextInt();
        }while(num[0] < 1|| 100 < num[0]);
        do{
            System.out.println("2つ目の数字を入力してください");
            num[1] = stdIn.nextInt();
        }while(num[1] < 1|| 100 < num[1]);
        do{
            System.out.println("3つ目の数字を入力してください");
            num[2] = stdIn.nextInt();
        }while(num[2] < 1|| 100 < num[2]);
        
        //ソート
        int a = 0;
        int cnt = 0;
        do{
            cnt = 0;
            for(int i = 0; i < num.length - 1; i++){
                if(num[i] < num[i + 1]){
                    a = num[i];
                    num[i] = num[i + 1];
                    num[i + 1] = a;
                    cnt++;
                }
            }
        }while(cnt != 0);
        
        //大きい数から引いてく
        int answer = 0;
        answer += num[0] - num[1];
        answer += num[1] - num[2];
        System.out.println(answer);
        }
}