import java.util.*;
public class Main{
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    String s = sc.nextLine();
    int k = sc.nextInt();
    char a = s.charAt(k-1); 
    char index[] = new char[n];
    
    for(int i=0;i<n;i++){
      index[i] = s.charAt(i);
      if(index[i] == a){
        System.out.print(index[i]);
      }else{
        index[i] = '*';
        System.out.print(index[i]);
      }
    }
  }
}   