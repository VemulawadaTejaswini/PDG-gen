import java.util.*;
public class Main {//ここが Main になっている
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String input = sc.readLine();
      String[] inputs = input.split(" ");
      int n = Integer.parseInt(inputs[0]);
      int r = Integer.parseInt(inputs[1]);
      
      if(n >= 10){
        System.out.println(r);
      }else{
        int num = 100 * (100-n);
        System.out.println(r+num);
      }
    }
}