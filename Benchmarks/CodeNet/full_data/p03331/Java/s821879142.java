import java.util.*;

public class Main{
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    int mintotal=-1;
    for(int A=0; A<=N/2+1;A++){
      
      int sumA=0;
      int sumB=0;

      String Astr = Integer.toString(A);
      for(int i=0;i<Astr.length();i++){
        sumA += Integer.parseInt(Astr);
      }
      String Bstr = Integer.toString(N-A);
      for(int i=0;i<Bstr.length();i++){
        sumB += Integer.parseInt(Bstr);
      }
        
      if((mintotal > (sumA+sumB)) || (mintotal==-1)){
        mintotal = sumA+sumB;
      }
    }
    
    System.out.println(mintotal);
  }
}
    
      
      