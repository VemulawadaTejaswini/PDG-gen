import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        double[] arr = new double[num];
        for (int i = 0;i < num;i++){
            arr[i] = in.nextDouble();
        }
        Arrays.sort(arr);
        for (int i = 0;i < num - 1;i++){
            arr[i+1] = (arr[i] + arr[i+1]) / 2;
        }
        
        System.out.println(arr[num - 1]);

        
    }
}
