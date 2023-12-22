import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nums = reader.readLine();
        StringBuilder result = new StringBuilder();
        for(int i = 0; i<nums.length(); i++){
            String n = nums.charAt(i) == '1' ? "9" : "1";
            result.append(n);
        }
        System.out.println(result);
    }
}
