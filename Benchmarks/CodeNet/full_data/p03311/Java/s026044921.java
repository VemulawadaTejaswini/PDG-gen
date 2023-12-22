import java.util.*;
public class Main{
    public static void main(String[] args)throws Exception{
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Integer[] array = new Integer[n];
        int ans1 = 0;



        for(int i = 1;i <= n;i++){//AN-Nを格納
            array[i-1] = sc.nextInt() - i;
        }

        Arrays.sort(array);//昇順ソート　降順は Arrays.sort(array,Collections.reverseOrder());

        int median1 = array[n/2];
        

        for(int i = 0;i < n;i++){//i=0,1,2,,,,n-1 で動作
            ans1 += Math.abs(array[i] - median1);
        }



        System.out.println(ans1);

    }
}