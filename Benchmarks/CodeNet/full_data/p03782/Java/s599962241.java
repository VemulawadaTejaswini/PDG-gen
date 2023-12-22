//package Regular_18_03_17;

import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        String s[] =in.nextLine().split(" ");
        int n=Integer.parseInt(s[0]),k=Integer.parseInt(s[1]);
        s=in.nextLine().split(" ");
        long arr[]=new long[n];
        arr[0]=Integer.parseInt(s[0]);
        int count=0;
        for (int i = 1; i <n ; i++) {
            arr[i]=Long.parseLong(s[i]);

        }
        Arrays.sort(arr);
        for (int i = 1; i <n ; i++) {
            arr[i]=arr[i-1]+arr[i];
        }
//        System.out.println(Arrays.toString(arr));
        for(int i=n-1;i>=0;i--){
            if(arr[i]-k<0){
                count=i;
                break;
            }
        }
        System.out.println(count);


    }
}
