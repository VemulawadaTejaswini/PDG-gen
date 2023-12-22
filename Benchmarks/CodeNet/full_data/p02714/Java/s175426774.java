import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(reader.readLine());
        char[] s=reader.readLine().toCharArray();
        long count=0;
        for (int i = 0; i <n; i++) {
            for (int j = i+1; j <n ; j++) {
                for (int k = j+1; k <n ; k++) {
                    if ((s[i]!=s[j] && s[i]!=s[k] && s[j]!=s[k]) && ((j+1)-(i+1))!=((k+1)-(j+1)))
                        count++;
                    else 
                        continue;
                }
            }
        }
        System.out.println(count);
    }

}