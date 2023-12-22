import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for (int i=0;i<n;i++){
            scanner.nextInt();
        }
        int i;
        for (i=0;i<=(n-1)/(k-1);i++){
        }
        if ((n-1)%(k-1)==0) i--;
        System.out.println(i);

    }

}
