import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.valueOf(st.nextToken());
            int M = Integer.valueOf(st.nextToken());
            st = new StringTokenizer(br.readLine());
            int len=Integer.MAX_VALUE;
            int[] data=new int[N]; 
            for (int i = 0; i < N; i++) {
                int point = Integer.valueOf(st.nextToken());
                data[i]=point;
            }
            
            for (int i = 0; i < N-M; i++) {
                if(data[i]<0){
                    if(data[i+M-1]<0){
                        len=Math.min(len,Math.abs(data[i]));
                    }else if(data[i+M-1]==0){
                        len=Math.min(len,Math.abs(data[i]));
                    }else {
                        len=Math.min(len,Math.abs(data[i])*2+data[i+M-1]);
                        len=Math.min(len,Math.abs(data[i])+data[i+M-1]*2);
                    }
                }else if(data[i]==0){
                    len=Math.min(len,data[i+M-1]);
                }else{
                    len=Math.min(len,data[i+M-1]);
                }
            }
            if(N==M){
                if(N==1){
                    len=Math.min(len,Math.abs(data[0]));
                }else{
                    len=Math.min(len,Math.abs(data[0])*2+data[M-1]);
                    len=Math.min(len,Math.abs(data[0])+data[M-1]*2);
                }
            }
            System.out.println(len);
            
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
