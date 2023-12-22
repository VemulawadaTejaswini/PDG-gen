import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.lang.*;
public class Main {
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        int result = 0;
        String [] arr = new String[10];
//        List<String> lst = new ArrayList <>();
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while(true){
           String input = buffer.readLine();
           if(input.equals("0") || input.equals("1")){
               arr[i] = input;
               i++;
           }else if(input.equals("B")){
               if (arr[0] == null){
               }else {
                   arr[i-1] = null;
                   i--;
               }
           }
           for(int j = 0; j <= i; j++){
               if (arr[j] == null){
                   break;
               }else{
                   System.err.print(arr[j]);
               }
               
           }
            
        }  
    }
}
