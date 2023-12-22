import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        long N = Long.parseLong(str);
        long[] A_E = new long[5];
        for (int i=0;i<5;i++){
            str = br.readLine();
            A_E[i] = Long.parseLong(str);
        }
        long min = A_E[0];
        for (long l:A_E){
            if (l<min){
                min = l;
            }
        }
        long ans;
        if (N%min!=0){
            ans = N/min+5;
        } else {
            ans = N/min+4;
        }
        System.out.println(ans);
    }
}