import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] A = new String[N];
        ArrayList<String> B = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            A[i] = sc.next();
            if (B.contains(A[i])) {
                continue;
            }else{
                B.add(A[i]);
            }
        }

        //System.out.println(B.toString());

        int[] count = new int[B.size()];
        
        for (int i = 0; i < N; i++) {
            count[B.indexOf(A[i])]++;
        }

        int max=0;
        for (int i = 0; i < count.length; i++) {
            if (count[i]>max) {
                max=count[i];
            }
        }

        for (int j = 0; j < count.length; j++) {
            if (count[j]==max) {
                System.out.println(B.get(j));
            }
        }
    }
    public static boolean HasElement(ArrayList<String> B, String A) {
        for (String string : B) {
            if (string.equals(A)) {
                return true;
            }
        }
        return false;
    }
}