import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = X/100;
        int Z = X-Y*100;
        // 0a+1b+2c+3d+4e+5f = Z
        // a+b+c+d+e+f = Y
        for (int f = 0; 5*f <= Z; f++) {
            for (int e = 0; 5*f+4*e <= Z; e++) {
                for (int d = 0; 5*f+4*e+3*d <= Z; d++) {
                    for (int c = 0; 5*f+4*e+3*d+2*c <= Z; c++) {
                        int b = Z-(5*f+4*e+3*d+2*c);
                        if (b < 0) {
                            continue;
                        }
                        int a = Y-(b+c+d+e+f);
                        if (a >= 0) {
                            System.out.println(1);
                            return;
                        }
                    }
                }
            }
        }
        
        System.out.println(0);
    }
}
