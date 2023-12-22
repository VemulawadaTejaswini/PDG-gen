import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        
        int L = sc.nextInt();
        int R = sc.nextInt();
        
        int min = 2019;
        int i = 0;
        for(i = L; i < Math.min(R, L + 2020); i++){
            if( i % 2019 < min ){
                min = i % 2019;
            }
        }
        
        System.out.println( min * (min + 1) );
        
    }
}
