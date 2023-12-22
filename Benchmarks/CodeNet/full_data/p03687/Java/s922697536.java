import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        // Here your code !
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] list = line.split("");
        
        int max = 1;
        int temp = 1;
        for(int i=0; i<line.length(); i++){
            temp = line.length() - line.replace(line.substring(i,i+1),"").length();
            if(max<temp){
                max = temp;
            }
        }
        int count = 0;
        int len = line.length();
        int min = max;
        while(len > min){
            len = len - 1;
            min = min + 1;
            count++;
        }
        System.out.println(count);
    }
}
