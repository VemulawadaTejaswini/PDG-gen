import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	int[] n=new int[3];
    int f=3;
    for(int i=0;i<3;i++){
      n[i]=sc.nextInt();
    }
    for(int i=0;i<2;i++){
      for(int j=i+1;j<3;j++){
        if(n[i]==n[j]){
          f--;
        }
      }
    }
    System.out.println(f);
  }
}
