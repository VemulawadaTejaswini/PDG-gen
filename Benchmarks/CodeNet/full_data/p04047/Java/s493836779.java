import java.util.*;
import java.io.*;

public class Main {
    public static void main(String arg[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int arr[] = new int[2*N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            arr[2*i] = Integer.parseInt(st.nextToken());
            arr[2*i+1] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int total = 0;
        for(int i=0;i<N;i++){
            total += arr[2*i];
        }
        System.out.println(total);
    } 
}