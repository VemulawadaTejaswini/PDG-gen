import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int max = 0;
        if(X == 1){
            System.out.println(1);
            return;
        }
        for(int i = 2;i*i <= X;i++){
            int power = i;
            while(true){
                power = power*i;
                if(power <= X){
                    break;
                }
            }
            max = Math.max(max,power);
        }
        System.out.println(max);
    }
}
