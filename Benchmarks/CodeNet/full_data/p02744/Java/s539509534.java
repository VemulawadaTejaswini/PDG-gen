import java.util.*;
class Main{
  public static void main(String args[]){
    int anum, n;
    int acode = (int)('a');
    String word="";
    Scanner s = new Scanner(System.in);
    n = s.nextInt();
    for(int i=0;i<n;i++)word = word + (char)acode;
    System.out.println(word);
    
    for(anum=n-1;anum>=1;anum--){
      String top = "";
      for(int i=0;i<anum;i++)top = top + (char)acode;
      top=top+(char)(acode+1);
      int[] codes = new int[n-anum-1];
      for(int i=0;i<n-anum-1;i++)codes[i]=0;
      for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
          
        }
      }
      word=top;
      System.out.println(word);
    }
  }
}