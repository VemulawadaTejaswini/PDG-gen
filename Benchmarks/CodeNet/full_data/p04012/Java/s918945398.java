import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int array[] = new int[26];
        for(int i = 0;i < str.length();i++){
            if(str.charAt(i) >= 'a' && str.charAt(i) <='z')
                array[str.charAt(i) - 'a']++;
        }
        for(int i = 0;i < array.length;i++){
            if(array[i] % 2 == 1){
                System.out.print("No");
                return;
            }
        }
        System.out.print("Yes");

    }
}