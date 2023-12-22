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
    int[] colorless_apples = new int[colorless_sum];
    initialize(red_apples,scanner);
    initialize(green_apples,scanner);
    initialize(colorless_apples,scanner);
    
    Arrays.sort(red_apples);
    Arrays.sort(green_apples);
    Arrays.sort(colorless_apples);
    
    int eat_sum = eat_red + eat_green;
    int[] eat_apples = new int[eat_sum];
    for(int i=0;i < eat_red;i++){
      eat_apples[i] = red_apples[red_apples.length-i-1];
    }
    for(int i=0;i < eat_green;i++){
      eat_apples[eat_red+i] = green_apples[green_apples.length-i-1];
    }
    
    Arrays.sort(eat_apples);
    for(int i=0;i < Math.min(colorless_apples.length,eat_apples.length);i++){
      if(colorless_apples[colorless_apples.length-1-i] > eat_apples[i]){
        eat_apples[i] = colorless_apples[colorless_apples.length-1-i];
      }else{
        break;
      }
    }
    
    int sum = 0;
    for(int i=0;i < eat_apples.length;i++){
      sum += eat_apples[i];
    }
    
    System.out.println(sum);
    
      
  }
  
  static void initialize(int[] apples,Scanner scanner){
    for(int i=0;i < apples.length;i++){
      apples[i] = scanner.nextInt();
    }
  }
}