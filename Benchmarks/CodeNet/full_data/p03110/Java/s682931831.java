import java.util.*;
public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        int monies[] = new int[N];
        String currencies[] = new String[N];

        for (int i = 0; i < N; i++){
            
            monies[i] = sc.nextInt();
            currencies[i] = sc.next();
        }

        int total = 0;
        int coefficient = 0;

        for (int i = 0; i < N; i++){
            
            if (coefficient[i].equals("JPY")) {
                coefficient = 1;
            } else if (coefficient[i].equals("BTC")) {
                coefficient = 380000;
            } else {

            }

            total += monies[i] * coefficient;
        }



        System.out.println(total);
     }
}