import java.io.*;

class abc149b {
    public static void main(String[] args) throws IOException {
        BufferedReader br = 
        new BufferedReader(new InputStreamReader(System.in));

        String str1 = br.readLine();
        String str2 = br.readLine();
        String str3 = br.readLine();

        int A = Integer.parseInt(str1);
        int B = Integer.parseInt(str2);
        int K = Integer.parseInt(str3);

        if(A >= K)
            A = A - K;
        else {
            B = A + B - K;
            A = 0;
        }

        System.out.println(A + " " + B);
    }
}