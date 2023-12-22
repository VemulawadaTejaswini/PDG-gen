import java.util.Scanner;
public class Main{
    public static int gcd(int a,int b,int c){
        int smallest = Math.min(a,Math.min(b, c));
        for(int i = smallest;i > 0;i--){
            if(a%i == 0 && b%i == 0 && c%i == 0){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int total = 0;
        for(int i = 1;i < number+1;i++){
            for(int j = 1;j < number+1;j++){
                for(int k = 1;k < number+1;k++){
                    total += gcd(i,j,k);
                }
            }
        }
        System.out.println(total);
    }
}