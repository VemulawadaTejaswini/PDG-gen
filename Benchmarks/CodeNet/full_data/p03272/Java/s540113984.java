import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        String[] nums = reader.readLine().split(" ");
        int trains = Integer.parseInt(nums[0]);
        int index = Integer.parseInt(nums[1]);
        
        System.out.println(trains - index + 1);
    }
}
