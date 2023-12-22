import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int sumX = 0;
        int sumY = 0;
        if(k > n){
            for(int i = 0;i < n;i++){
                sumX = sumX + x;
            }
        }
        else{
            for(int i = 0;i < k;i++){
                sumX = sumX + x;
            }
            for(int j = k;j < n;j++){
                sumY = sumY + y;
            }
        }
        System.out.println(sumX+sumY);
    }
}
