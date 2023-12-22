import java.util.*;

public class Main {

    static final int MOD = 1000000007;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char b = sc.next().charAt(0);
        char arr[] = {'A','C','G','T'};
        char arr2[] = {'T','G','C','A'};
        for(int i=0;i<4;i++)if(b==arr[i]) System.out.println(arr2[i]);
    }
}
