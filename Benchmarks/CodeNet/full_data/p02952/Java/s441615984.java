import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int total = 0;
        for(int i = 1; i <= N; i++){
            int numOfdigits = String.valueOf( i ).length();
            if (numOfdigits % 2 == 1){
                total++;
            }
        }
        
        System.out.println(total);
    }
}
