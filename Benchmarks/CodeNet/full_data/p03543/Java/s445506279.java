import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] num = br.readLine().trim().split("");
        if((num[0].equals(num[1]) && num[1].equals(num[2])) || (num[1].equals(num[2]) && num[2].equals(num[3]))){
            System.out.println("YES");
        }else System.out.println("NO");
}