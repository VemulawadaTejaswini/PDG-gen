import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x = sc.nextInt();
    int[] l = new int[n];
    int sum = 0;
    int count = 0;
    for(int i=0;i<n;i++){
      l[i]=sc.nextInt();
    }
    for(int j=0;j<n;j++){
      sum += l[j];
      if(sum > x){
        break;
      }
      count++;
    }
    System.out.println(count+1);
  }
}