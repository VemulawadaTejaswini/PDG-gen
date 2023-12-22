import java.io.*;
import java.util.ArrayList;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        long N = Long.parseLong(str);
        ArrayList<Long> num = new ArrayList<>();
        long i= 1;
        while (i<Math.sqrt(N)){
            if ((N-i)%i==0){
                num.add(N/i-1);
            }
            i++;
        }
        long ans = 0;
        for (long n:num){
            ans += n;
        }
        System.out.println(ans);
    }
}