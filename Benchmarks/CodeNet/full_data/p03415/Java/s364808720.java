import java.util.*;

public class Main {
    public static void main(String[] args) {
        char[][] c = new char[3][3];
        Scanner sc = new Scanner(System.in);
        c[0] = sc.next().toCharArray();
        c[1] = sc.next().toCharArray();
        c[2] = sc.next().toCharArray();
        
        for(int i=0;i<3;i++) {
            System.out.print(c[i][i]);
        }
        System.out.println();
        sc.close();
    }
}
