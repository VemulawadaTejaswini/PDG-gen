import java.io.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long N = Long.parseLong(br.readLine());
        long[] arr = new long[5];
        long min = Long.MAX_VALUE;
        for(int i=0;i<5;++i)
        {
            arr[i] = Long.parseLong(br.readLine());
            if(min>arr[i]) min = arr[i];
        }
        long ans = N/min + (N%min==0?0:1);

        bw.write((ans+4)+"");
        bw.close();
    }
}
