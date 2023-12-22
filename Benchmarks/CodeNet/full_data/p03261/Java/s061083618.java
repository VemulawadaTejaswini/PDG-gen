import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s[] = new String[n];
    String answer = "Yes";
    for(int i=0;i<n;i++){
      s[i]=sc.next();
    }
    for(int i=0;i<n-1;i++){
      if(!s[i].substring(s[i].length()-1,s[i].length())
         .equals(s[i+1].substring(0,1))){
        answer="No";
        break;
      }
    }
    for(int i=0;i<n;i++){
      for(int j=i+1;j<n;j++){
        if(s[i].equals(s[j])){
          answer = "No";
        }
      }
    }
    System.out.println(answer);
           
          
      
    
  }
  

  
}