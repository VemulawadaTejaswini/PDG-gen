import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        String str;
        int arr[]=new int[n];
        int num=0;
        for(int i=0;i<n;i++) {
        	str=sc.next();
        	for(int j=0;j<str.length();j++) {
        		num+=(int)str.charAt(j);
        	}
        	arr[i]=num;
        	num=0;
        }
        
        //Arrays.sort(arr);
        int sum=0;
        for(int i=0;i<arr.length;i++) {
        	for(int j=i+1;j<arr.length;j++) {
//        		if(arr[j]>arr[i]) {
//        			break;
//        		}
        		if(arr[i]==arr[j]) {
        			sum++;
        		}
        	}
        }
        
        System.out.println(sum);
    }
}