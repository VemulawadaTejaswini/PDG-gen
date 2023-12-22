import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] arr = new int[N];
        double sum = 0;
        for(int i=0;i<N;i++)
        {
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        if(arr[N-M] >= sum/(4*M))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
