import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int l = Integer.parseInt(sc.next());
    int a = Integer.parseInt(sc.next());
    int b = Integer.parseInt(sc.next());
    int w = Integer.parseInt(sc.next());
    
    int[] m = new int[l];
    for(int i=0; i<l; i++){
      m[i] = a + b*i;
    }

    String[] x = new String[l];
    for(int j=0; j<l; j++){
      x[j] = String.valueOf(m[j]);
    }

    String y = "";
    for(int k=0; k<l; k++){
      y += x[k];
    }

    System.out.println(Integer.parseInt(y)%w);
  }
}