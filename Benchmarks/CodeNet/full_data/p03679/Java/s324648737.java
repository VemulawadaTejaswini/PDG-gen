import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] strArray = line.split(" ");
        int d = Integer.valueOf(strArray[0]);
        int A = Integer.valueOf(strArray[1]);
        int B = Integer.valueOf(strArray[2]);

        if(A >= B){
            System.out.println("delicious");
        }else if(A + d >= B){
            System.out.println("safe");
        }else{
            System.out.println("dangerous");
        }
    }
}