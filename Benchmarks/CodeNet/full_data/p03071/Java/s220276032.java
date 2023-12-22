import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int A,B;
        String[] sb = str.split(" ");
        A = Integer.parseInt(sb[0]);
        B = Integer.parseInt(sb[1]);
        int ans;
        if (A > B){
            ans = 2 * A - 1;
        } else if (A < B) {
            ans = 2 * B - 1;
        } else {
            ans = 2 * A;
        }
        System.out.println(ans);
    }
}