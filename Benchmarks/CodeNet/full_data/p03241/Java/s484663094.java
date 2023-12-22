import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int up = (int) Math.sqrt(M)+1;
        for(int i=up;i>=1;i--){
            if(M%i==0){
                if(M/i>=N){
                    System.out.println(i);
                    System.exit(0);
                }
            }
        }
    }
}
