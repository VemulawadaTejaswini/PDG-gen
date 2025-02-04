import java.util.Scanner;

/**
 * Created by wenzhong on 2016/8/6.
 */
public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {//注意while处理多个case
            int num = in.nextInt();
            int[] a=new int[num];
            int max=Integer.MIN_VALUE;
            int min=Integer.MAX_VALUE;
            for(int i=0;i<num;i++){
                a[i]=in.nextInt();
                max=Math.max(max, a[i]);
                min=Math.min(min, a[i]);
            }
            int min1=Integer.MAX_VALUE;
            for(int i=min;i<=max;i++){
                int sum=0;
                for(int s:a){
                    sum+=(s-i)*(s-i);
                }
                min1=Math.min(min1, sum);
            }
            System.out.println(min1);
        }
    }
}