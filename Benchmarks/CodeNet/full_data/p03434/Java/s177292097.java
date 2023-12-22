import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        for (int i = 0;i < n;++i){
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);
        int a = 0,b = 0;
        boolean flag = true;
        for (int i = n - 1;i >= 0;--i){
           if(flag)a +=  array[i];
            else b += array[i];
            flag = !flag;
        }
        System.out.println(a - b);
    }
}