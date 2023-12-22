import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String   input   = reader.readLine();
    String[] numbers = input.split(" ");
    System.out.println(numbers[2] +" "+ numbers[0] +" "+ numbers[1]);
  }
}