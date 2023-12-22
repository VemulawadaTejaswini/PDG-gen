import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt(),k=sc.nextInt();
    Integer[] array= new Integer[n];
    for(int i=0; i<n; i++){
      array[i]=sc.nextInt();
    }
    Arrays.sort(array,Collections.reverseOrder());
    int sum=0;
    for(int j=0; j<k; j++){
      sum+=array[j];
    }
    System.out.println(sum);
  }
}