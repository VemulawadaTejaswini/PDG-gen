import java.util.*;

class Main{
    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);
        int count_black = scanner.nextInt();
        int black_position = scanner.nextInt();
      
        int min_black_position = black_position - count_black + 1;
        int max_black_position = black_position + count_black - 1;
        
        for(int i = min_black_position; i < max_black_position + 1; i++){
                    System.out.print(i + " ");
        }
    }
}