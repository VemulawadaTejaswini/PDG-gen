
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
        for (int i = 0; i <N ; i++){
            int count=0;
            start=arr[i];
            while(true){
//                System.out.println(totalbuses);
                if(arr[i]<=(start+C)&& count<C){
                    count++;
                    i++;
                    if(count==C||i>=N ||arr[i]>(start+C))
                    {
                        totalbuses++;
//                        count=0;

                        i--;
                        break;

                    }
                }
                else{
                    i--;
                    break;
                }
            }

        }
        System.out.println(totalbuses);

    }
}
