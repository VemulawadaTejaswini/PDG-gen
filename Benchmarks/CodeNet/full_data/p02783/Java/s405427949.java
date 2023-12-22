import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
      String[] split = input.split(" ");
        int totalPower = Integer.parseInt(split[0]);
        int power = Integer.parseInt(split[1]);
        int count =  (int) Math.ceil((double)totalPower/power);
        System.out.println(count);
    }
}