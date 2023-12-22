import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int sum = sc.nextInt();
    int g = sc.nextInt();
    int[] donutsG = new int[sum]; 
    
    int canMake = 0; 
    for(int i = 0; i< sum ; i++){
      donutsG[i] = sc.nextInt();
      if(donutsG[i]<=g){
      	g = g-donutsG[i];
        ++canMake;
        }
    }
    Arrays.sort(donutsG);
    
    while(g >= donutsG[0]){
      ++canMake;
      g= g-donutsG[0];
    }
    System.out.println(canMake);
  }
}