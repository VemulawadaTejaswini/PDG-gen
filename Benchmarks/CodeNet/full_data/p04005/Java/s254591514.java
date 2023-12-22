import java.util.*;

public class Main{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int[] c = new int[3];
        int A = sc.nextInt();
        c[0] = A;
        int B = sc.nextInt();
        c[1] = B;
        int C = sc.nextInt();
        c[2] = C;
        sc.close();
        Arrays.sort(c);

        if(A%2 == 0 || B%2 == 0 || C%2 == 0)
            System.out.println(0);
        else{
            System.out.println(c[0]*c[1]);
        }
    }
}