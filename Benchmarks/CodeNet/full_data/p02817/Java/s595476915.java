import java.io.*;

class abc149a {
    public static void main(String[] args) throws IOException {
        BufferedReader br = 
        new BufferedReader(new InputStreamReader(System.in));

        String S = br.readLine();
        String T = br.readLine();

        StringBuffer T1 = new StringBuffer(T);
        T1.append(S);

        System.out.println(T1);
    }
}