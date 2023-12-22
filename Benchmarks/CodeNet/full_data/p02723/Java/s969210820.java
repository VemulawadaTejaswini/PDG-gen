import java.util.Scanner;
import java.util.Arrays;
class Main{
  public static void main(String[] args){
    
    //入力処理
    Scanner scanner = new Scanner(System.in);
    int eat_red = scanner.nextInt();
    int eat_green = scanner.nextInt();
    int red_sum = scanner.nextInt();
    int green_sum = scanner.nextInt();
    int colorless_sum = scanner.nextInt();
    int[] red_apples = new int[red_sum];
    int[] green_apples = new int[green_sum];
    int[] candidate_apples = new int[colorless_sum+red_sum+green_sum];
    initialize(red_apples,scanner);
    initialize(green_apples,scanner);
    for(int i=0;i < colorless_sum;i++){
      candidate_apples[i] = scanner.nextInt();
    }
     
    
    Arrays.sort(red_apples);
    Arrays.sort(green_apples);
    
    for(int i=0;i < eat_red;i++){
      candidate_apples[colorless_sum+i] = red_apples[red_apples.length-i-1];
    }
    for(int i=0;i < eat_green;i++){
      candidate_apples[colorless_sum+eat_red+i] = green_apples[green_apples.length-i-1];
    }
    
    Arrays.sort(candidate_apples);
    int eat_sum = eat_red + eat_green;
    
    long sum = 0;
    for(int i=0;i < eat_sum;i++){
      sum += candidate_apples[candidate_apples.length-1-i];
    }
    
    System.out.println(sum);
    
      
  }
  
  static void initialize(int[] apples,Scanner scanner){
    for(int i=0;i < apples.length;i++){
      apples[i] = scanner.nextInt();
    }
  }
}