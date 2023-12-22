import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        int number[] = new int[N];
        int DP[] = new int[N];

        for(int i=0;i<number.length;i++)
        	number[i] = in.nextInt();

        long ans = 0;
        long sum=0;

        for(int i=0;i<number.length;i++){
        	sum = 0;
        	for(int j=i;j<number.length;j++){
        		sum+=number[j];
//        		System.out.println(sum);
        		if(sum==0){
        			if(i!=0){
        				ans+=(DP[i-1]+1);
        				DP[j]+=DP[i-1]+1;
        			}else{
        				ans++;
        				DP[j]++;
        			}

        			break;
        		}

        	}
        }



        System.out.println(ans);

        in.close();
    }

}
