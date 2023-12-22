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
        boolean answer = false;
        int count = 0;
        for(int i=N-1;i>=0;i--)
        {
            if(arr[i] >= sum/(4*M))
                count++;
            if(count == M)
            {
                answer = true;
                break;
            }
        }
        if(answer)
            System.out.println("Yes");
        else
            System.out.println("No");
//        System.out.println(Arrays.toString(arr));
//        if(arr[N-M] >= sum/(4*M))
//            System.out.println("YES");
//        else
//            System.out.println("NO");
    }
}
