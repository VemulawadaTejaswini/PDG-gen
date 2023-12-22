import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] num = line.split(" ");
        int n = Integer.parseInt(num[0]);
        int x = Integer.parseInt(num[1]);
        int result = n; //真横にx、反射してn-xまでは確定なので、合計値のnを初期値とする。
        int divisor;
        int divided;
        if(n-x > x){
            divided = n-x;
            divisor = x;
        } else {
            divided = x;
            divisor = n-x;
        }
        int a;
        while(divided % divisor != 0){
            result = result + 2 * (divided / divisor);
            a = divided;
            divided = divisor;
            divisor = a % divisor;
        }
        result = result + 2 * (divided / divisor) + 1;
        System.out.println(result);
    }
}