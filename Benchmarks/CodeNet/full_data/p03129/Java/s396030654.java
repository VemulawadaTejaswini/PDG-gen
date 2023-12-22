import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int n = in.nextInt();
            int k = in.nextInt();
            if(n % 2 == 0){
                n = n / 2;
            }else{
                n = n / 2 + 1;
            }
            if(n >= k){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}