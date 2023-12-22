import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int posC = str.length() + 5;
        for(int i = 0;i < str.length();i++){
            if(str.charAt(i) == 'C'){
                posC = i;
                break;
            }
        }
        for(int i = str.length() - 1;i >= 0;i--){
            if(str.charAt(i) == 'F'){
               if(posC < i){
                   System.out.print("Yes");
               }
                else System.out.print("No");
                return;
            }
        }

    }
}