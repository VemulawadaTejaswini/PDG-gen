import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    Integer[] street = new Integer[n];
    for(int i=0; i<n; i++){
      street[i]=sc.nextInt();
    }
    Arrays.sort(street);
    System.out.println(street[street.length-1] - street[0]);
  }
}