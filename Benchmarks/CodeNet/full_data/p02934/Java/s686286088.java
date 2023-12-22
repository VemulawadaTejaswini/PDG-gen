import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner scan = new Scanner(System.in);
        int a1 = scan.nextInt();
        float total = 0;
        float f[] = new float[10000];
        for(int i = 0; i < a1; i++){
            f[i] = scan.nextFloat();
            total += 1/f[i];
        }
        System.out.println(1/total);
    }
}
