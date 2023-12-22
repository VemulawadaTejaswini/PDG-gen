import java.util.*;
import java.time.format.DateTimeFormatter;
import java.io.*;
public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
        int a[] = new int[n];
        int sum=0;
        
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
            sum = sum + a[i];
        }
        
        if(sum == x){
            System.out.println(n);
        }else if(sum < x){
            System.out.println(n-1);
        }else if(sum > x){
            for (int i=0; i<n-1; i++) {
                for (int j=n-1; j>i; j--) {
                    if (a[j-1] > a[j]) {
                        int tmp = a[j-1];
                        a[j-1] = a[j];
                        a[j] = tmp;
                    }
                }
            }
            
            for(int i=0; i<n; i++){
                if(a[i]<x){
                    x = x-a[i];
                }else{
                    System.out.println(i);
                    return;
                }
            }
        }
    }
}