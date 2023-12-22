import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.List;

public class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int x=0;
        int index=n/2 -1 ;
        if (arr[index]==arr[index+1]){
            x=0;
        }else {
            for (int i=index;i>=0;i--){
                if (i>0 && arr[index]==arr[index-1]){
                    x++;
                }
            }
        }
        System.out.println(x);

    }

}

