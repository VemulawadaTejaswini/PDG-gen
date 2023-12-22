import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String str = br.readLine();
            String input[] = str.split(" ");
            int L = Integer.valueOf(input[0]);
            int R = Integer.valueOf(input[1]);
            
            int result = 2019;
            for(int i = L; i<R; i++) {
                for(int j = i+1; j<=R; j++) {
                    if( (i * j)%2019 < result ) {
                        result = (i * j)%2019;
                    }
                }
            }
            System.out.println(result);
            
            
        }catch(IOException e) {
            
        }
    }

}