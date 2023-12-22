import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner n = new Scanner(System.in);
    for(int i=0; i<n; i++){
      int dec = n.nextInt();
      for(int j=n.length()-1; j<=0;j--){
        	dec[j] = dec[j]^dec[j+1];
      }
    }
    System.out.println(dec);
  }
}