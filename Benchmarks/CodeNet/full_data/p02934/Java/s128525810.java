import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float sum = 0;
        for(int i = 0; i < n; i++){
            sum = sum + (1 / sc.nextFloat());
        }
        System.out.println(1 / sum);
    }
}