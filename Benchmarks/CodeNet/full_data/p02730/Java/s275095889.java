import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String ans = "Yes";
    
    int l = s.length();
    
    for(int i=0;i<(l-1)/2;i++){
      if(s.charAt(i) != s.charAt(l-1-i))
        ans = "No";
    }
    
    l=l/2;
    if(!ans.equals("No")){
      for(int i=0;i<l/2;i++){
        if(s.charAt(i) != s.charAt(l-1-i))
          ans = "No";
      }
    }
    
    System.out.print(ans);
  }
}