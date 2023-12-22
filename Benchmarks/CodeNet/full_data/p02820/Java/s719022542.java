import java.util.Scanner;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int R = sc.nextInt();
    int S = sc.nextInt();
    int P = sc.nextInt();   
    char[] t = sc.next().toCharArray();
    int point = 0;
    for(int i = 0;i < k;i++){
      if(t[i] == 'r')  point += P;
      if(t[i] == 's')  point += R;
      if(t[i] == 'p')  point += S;
    }
    for(int j = k;j < n;j++){
      if(t[j] != t[j-k]){
        if(t[j] == 'r')  point += P;
        if(t[j] == 's')  point += R;
        if(t[j] == 'p')  point += S;
      }else{
        if(t[j] == 'r' && t[j+k] == 'r') t[j] = 's';
        if(t[j] == 's' && t[j+k] == 's') t[j] = 'p';
        if(t[j] == 'p' && t[j+k] == 'p') t[j] = 'r';        
      } 
    }  
    System.out.println(point);
  }
}