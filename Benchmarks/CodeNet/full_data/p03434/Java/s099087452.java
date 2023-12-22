import java.util.*;
 
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Integer[] array = new Integer[n];
    for(int i = 0; i < n; i++) {
    	array[i] = sc.nextInt();
    }
    
    //降順にソート
    Arrays.sort(array, Collections.reverseOrder());
    
    int a = 0; //アリス
    int b = 0; //ボブ
    for(int i = 1; i <= n; i++) {
    	if(i % 2 == 1) {
        	a += array[i-1];
        } else {
        	b += array[i-1];
        }
    }
    System.out.println(a-b);
  }
}