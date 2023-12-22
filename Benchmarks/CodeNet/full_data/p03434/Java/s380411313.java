import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class CardGameForTwo{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer a[] = new Integer [n];
        int sum = 0;
        int flag = 1;

        for(int i = 0;i < n;i++){
            a[i] = scanner.nextInt();
        }

        Arrays.sort(a,Comparator.reverseOrder());
        for(int i = 0;i < n;i++){
            sum += flag * a[i];
            flag = -flag;
        }

        System.out.println(sum);
    }
}