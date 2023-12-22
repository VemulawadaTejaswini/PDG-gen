import java.util.Scanner;
import java.util.ArrayList;

public class Main{
  public static void main(String args[]){
  	Scanner scan = new Scanner(System.in);
    String str;
    Long n, m;
    Long len = 0;
    ArrayList<Long> x = new ArrayList<Long>();
    ArrayList<Long> y = new ArrayList<Long>();
    Long result = 0;
    
    while(scan.hasNextLine()){
      len++;
      str = scan.next();
      if(count == 0){
        String[] nums = str.split(" ");
        n = Long.parseLong(nums[0]);
        m = Long.parseLong(nums[1]);
      }else{
      	String[] nums = str.split(" ");
        x.add(Long.parseLong(nums[0]));
        y.add(Long.parseLong(nums[1]));
      }
    }
    
    int input[][] = new int[max][3];
    
    for(int i = 0; i < max; i++){
      input[i][0] = x.get(i);
      input[i][1] = y.get(i);
      input[i][2] = 0;
    }
    
    for(int i = 0; i < max; i++){
      if(input[i][2] != 1){
        Long tmp = input[i][0];
        for(int j = i + 1; j < max; j++){
          if(input[j][0] == tmp || input[j][1] == tmp){
          	input[j][2] = 1;
          }
        }
      }
      result++;
    }
    System.out.println(result);
  }
}
