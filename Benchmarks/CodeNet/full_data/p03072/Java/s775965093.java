import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int N = Integer.parseInt(str);
        str = br.readLine();
        String[] s = str.split(" ");
        int[] H = new int[N];
        for (int i=0;i<N;i++){
            H[i] = Integer.parseInt(s[i]);
        }
        int ans = 1;
        int mx = H[0];
        for (int i=1;i<N;i++){
            if (H[i]>=mx){
                ans++;
                mx = H[i];
            }
        }
        System.out.println(ans);
    }
}