import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        long max = 0;
        for(int i = 1;i*i <= X;i++){
            long power = i;
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
