import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        int num2[] = new int[num];
        for(int h=0;h<num;h++)
        {
            num2[h]=sc.nextInt();
        }
        for(int i=0;i<num-1;i++)
        {
            for(int j=i+1;j<num;j++)
            {
                sum = sum + num2[i] * num2[j];
            }
        }
        System.out.println(sum);
            
    }
}