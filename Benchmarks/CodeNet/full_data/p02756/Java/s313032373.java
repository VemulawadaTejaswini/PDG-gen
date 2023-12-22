import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String s = input.readLine();
        int q = Integer.parseInt(input.readLine());

        for(int i=0;i<q;i++){
            String[] qn = input.readLine().split(" ");
            if(qn.length == 1){
                StringBuffer sb = new StringBuffer(s);
                s = sb.reverse().toString();
            }else{
                if(qn[1].equals("1")){
                    s = qn[2] + s;
                }else if(qn[1].equals("2")){
                    s = s + qn[2];
                }
            }
        
        }
        System.out.println(s);
    }
}
