import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
 
 
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] s=br.readLine().split(" ");
        long N=Long.parseLong(s[0]);
        long C=Long.parseLong(s[1]);
        long K=Long.parseLong(s[2]);
        long[]arr=new long[(int)N];
        for (int i = 0; i <N ; i++) {
            arr[i]=Long.parseLong(br.readLine());
 
 
        }
        Arrays.sort(arr);
        long start=arr[0];
        int totalbuses=0;
 
        totalbuses=1;
       long cc=0;
        for (int i = 0; i <N ; i++) {
            if(start+K<=arr[i] || cc>=C){
                   totalbuses++;
                    start=arr[i];
                continue;
            }
            else{
                
                cc++;
            }
        }
        System.out.println(totalbuses);
 
    }
}