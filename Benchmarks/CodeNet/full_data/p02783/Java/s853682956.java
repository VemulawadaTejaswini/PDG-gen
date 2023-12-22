import java.util.*;

public class Main{
    public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
      String[] testList = scanner.nextLine().split(" ");
      int HP = Integer.parseInt(testList[0]);
      int ATTACK = Integer.parseInt(testList[1]);
      int attack_count = 0;
      
      if(HP % ATTACK == 0){
        attack_count = HP / ATTACK;
      }else{
        attack_count = HP / ATTACK + 1;
      }
      
      System.out.println(attack_count);
      
    }
} 