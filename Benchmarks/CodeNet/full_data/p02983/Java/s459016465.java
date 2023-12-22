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
            
            int result = 2018;
            for(int i = L; i<R; i++) {
				if(i%2019 == 0){
                  result = 0;
                  break;
                }
              for(int j = i+1; j<=R; j++) {
                  int N = i* j;
                    if( N % 2019 < result ) {
                        result = N % 2019;
                    }
                }
            }
            System.out.println(result);
            
            
        }catch(IOException e) {
            
        }
    }

}
