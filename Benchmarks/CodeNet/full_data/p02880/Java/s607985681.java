import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] Args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()), division;
        boolean petroPresidente = false;
        for(int i = 1; i < 10;i++){
            if(n % i == 0){
                division = n / i;
                if( division >= 1 && division <= 9) {
                    petroPresidente = true;
                    break;
                }
            }
        }
        if(petroPresidente) {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
