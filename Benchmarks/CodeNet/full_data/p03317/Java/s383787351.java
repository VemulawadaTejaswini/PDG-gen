import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int array[] = new int[n];
        int mini = -1;
        for (int i = 0;i < n;++i){
            array[i] = sc.nextInt();
            if(array[i] == 1)mini = i;
        }
        int c = search1(mini,k,n);
        int c2 = search2(mini,k,n);
        System.out.println(c > c2 ? c2 : c);

    }

    public static int search2(int mini,int k,int n){
        int p1 = mini;
        int p2 = mini;
        int c = 0;
        boolean isFirst = true;
        if(p2 + 1 != n)while (true){
            p2 -= (k - 1);
            ++c;
            if(isFirst && p2 < 0){
                p1 -= p2;
                break;
            }
            else if(p2 <= 0){
                break;
            }
            isFirst = false;
        }
        if(p1 != 0)while (true){
            p1 += (k - 1);
            ++c;
            if(p1 + 1 >= n)break;
        }
        return c;
    }

    public static int search1(int mini,int k,int n){
        int p1 = mini;
        int p2 = mini;
        int c = 0;
        boolean isFirst = true;
        if(p1 + 1 != n)while (true){
            p1 += (k - 1);
            ++c;
            if(isFirst && p1 >= n){
                p2 -= p1 - (n - 1);
                break;
            }
            else if(p1 + 1 >= n){
                break;
            }
            isFirst = false;
        }
        if(p2 != 0)while (true){
            p2 -= (k - 1);
            ++c;
            if(p2 <= 0)break;
        }
        return c;
    }




}
