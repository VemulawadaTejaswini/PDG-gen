import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
 
        int[] ant = new int[5];
        //        String s = sc.next();
 
        boolean ans = false;
 
        for (int i = 0; i < 5; i++) {
            ant[i] = sc.nextInt();
        }
        int k = sc.nextInt();
 
        if ((Math.abs(ant[0] - ant[1]) > k) || (Math.abs(ant[0] - ant[2]) > k) ||
                (Math.abs(ant[0] - ant[3]) > k) || (Math.abs(ant[0] - ant[4]) > k) ||
                (Math.abs(ant[1] - ant[2]) > k) || (Math.abs(ant[1] - ant[3]) > k) ||
                (Math.abs(ant[1] - ant[4]) > k) || (Math.abs(ant[2] - ant[3]) > k) ||
                (Math.abs(ant[2] - ant[4]) > k) || (Math.abs(ant[3] - ant[4]) > k))
            ans = true;
 
        sc.close();
        System.out.println(ans ? ":(" : "Yay!");
 
    }
}