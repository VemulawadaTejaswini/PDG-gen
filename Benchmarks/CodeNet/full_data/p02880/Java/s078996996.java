import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=1; i<10; i++){
            if(N%i==0 && N/i<10){
                System.out.println("Yes");
                return;
            }
        }
		System.out.println("No");
    }
}
