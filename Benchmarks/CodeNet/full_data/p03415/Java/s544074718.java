import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String[] A = new String[3];
        for(int i=0;i<3;i++){
            A[i] = sc.next();
            sb.append(A[i].charAt(i));
        }
        String ans = sb.toString();
        

        System.out.println(ans);
    }
}
