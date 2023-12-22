import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int[] m = new int[2];
    int[] d = new int[2];
    for(int i=0; i<2; i++){
      m[i] = sc.nextInt();
      d[i] = sc.nextInt();
    }
    
    if(m[0] != m[1]){
      System.out.println(1);
    }
    else{
      System.out.println(0);
    }
  }
}