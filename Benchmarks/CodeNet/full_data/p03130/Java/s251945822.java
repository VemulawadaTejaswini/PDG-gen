import java.util.*;

public class Main{
  public static void main(String[] main){
    Scanner sc = new Scanner(System.in);
    int a[] = new int[4];
    for(int i=0; i<6; i++){
      int temp=sc.nextInt();
      a[temp-1]++;
    }
    
    if(a[0]==0 || a[1]==0 || a[2]==0 || a[3]==0){
      System.out.println("NO");
    }else{
      System.out.println("YES");
    }
  }
}
      
    
    
    