import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            try {
                String str = br.readLine();
                String input[] = str.split(" ");
                int N = Integer.valueOf(input[0]);
                int A = Integer.valueOf(input[1]);
                int B = Integer.valueOf(input[2]);
                
                if(N * A > B) {
                    System.out.println(B);
                }else {
                    System.out.println(N*A);
                }
                
                
            }catch(IOException e) {
                
            }
            
    }

}