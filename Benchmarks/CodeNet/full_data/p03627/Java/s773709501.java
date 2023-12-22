import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Integer[] a = new Integer[n];

        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        Arrays.sort(a, Comparator.reverseOrder());

        int x = 0;
        int y = 0;
        int c = 0;

        for(; x > 0 || c < n - 1; c++){
            if(a[c].equals(a[c + 1])){
                x = a[c];
                c += 2;
            }
        }
        for(; y > 0 || c < n - 1; c++){
            if(a[c].equals(a[c + 1])){
                y = a[c];
            }
        }

        System.out.println(x * y);

    }
}
