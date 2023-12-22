import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringBuilder left = new StringBuilder();
        StringBuilder right = new StringBuilder();
        int reverse = 0;
        int q = Integer.parseInt(br.readLine());
        for(int i = 0; i < q; i++){
            String[] query = br.readLine().split(" ");
            if("1".equals(query[0])){
                reverse = (reverse + 1) % 2;
            } else {
                int command = Integer.parseInt(query[1]);
                if((reverse == 0 && command == 2) || (reverse == 1 && command == 1)){
                    right.append(query[2]);
                } else {
                    left.insert(0, query[2]);
                }
            }
        }
        br.close();
        String result = left.toString() + s + right.toString();
        if(reverse == 1){
            result = new StringBuilder(result).reverse().toString();
        }
        System.out.println(result);
    }
}