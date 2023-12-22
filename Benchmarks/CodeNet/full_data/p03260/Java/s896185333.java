import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] nums = reader.readLine().split(" ");
        Boolean[] b = new Boolean[3];
        for(int i = 1; i <= 3; i++){
            b[i-1] = (Integer.parseInt(nums[0]) + Integer.parseInt(nums[1]) + i) % 2 == 1;
        }
        if(b[0] | b[1] | b[2]){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
