import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int x = sc.nextInt();
        
        for(int i=0; i<k*2-1; i++){
            System.out.print((x-(k-1))+i + " ");
        }
    }
}