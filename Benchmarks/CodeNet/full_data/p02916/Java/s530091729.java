import java.util.*;
 
public class Main{
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int number = sc.nextInt();
      int[] jumban = new int[number];
      int[] manzoku = new int[number];
      int[] addManzoku = new int[number-1];
      for(int i = 0; i < number; i++){
          jumban[i] = sc.nextInt();
      }
      for(int j = 0; j < number; j++){
          manzoku[j] = sc.nextInt();
      }
      for(int k = 0; k < number-1; k++){
          addManzoku[k] = sc.nextInt();
      }
      int sumManzoku = 0;
      for(int l = 0; l < number; l++){
          int bango = jumban[l];
          sumManzoku += manzoku[bango];
          if(l > 0 && jumban[l]-1 == jumban[l-1]){
              sumManzoku += addManzoku[l-1];
          }
      }
      System.out.println(sumManzoku);
    }
 
}