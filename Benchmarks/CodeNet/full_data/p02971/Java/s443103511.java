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
        int arr[]=new int[20000000];
        int input[]=new int[n];
        for (int i=0;i<n;i++){
            int x=sc.nextInt();
            arr[x]++;
            input[i]=x;
        }
        int max=-1;
        int max2=-1;
        for (int i=arr.length-1;i>=0;i--){
            if (arr[i]>=2 && max==-1){
                max=i;
                max2=i;
//                System.out.println("hi");
                break;
            }else if (arr[i]==1 && max==-1){
                max=i;
//                System.out.println("hi1");
            }else if (arr[i]==1 && max!=-1){
                max2=i;
//                System.out.println(i+"hi2");
                break;
            }
        }
        StringBuilder sb=new StringBuilder();
        for (int i=0;i<n;i++){
            if (input[i]==max){
                sb.append(max2+"\n");
            }else sb.append(max+"\n");
        }
        System.out.print(sb);



    }

}

