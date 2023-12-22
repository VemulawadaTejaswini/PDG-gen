import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        double[] arr = new double[num];
        double max = 0;
        double sum = 0;
        for (int i = 0;i < num;i++){
            arr[i] = in.nextDouble();
            if (max < arr[i]){
                max = arr[i];
            }
        }
        for (int i = 0;i < num;i++){
            sum += max / arr[i];
        }
        System.out.println(max/sum);

        
    }
}
