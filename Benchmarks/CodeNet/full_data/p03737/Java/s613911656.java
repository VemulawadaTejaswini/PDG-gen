import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] inputs = line.split(" ");
        
        String s1 = inputs[0];
        String s2 = inputs[1];
        String s3 = inputs[2];
        String c1 = s1.substring(0, 1);
        String c2 = s2.substring(0, 1);
        String c3 = s3.substring(0, 1);
        String S1 = c1.toUpperCase();
        String S2 = c2.toUpperCase();
        String S3 = c3.toUpperCase();
        
        System.out.println(S1+S2+S3);
    }
}
