import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String[] S = sc.nextLine().split(" ");
    int N = Integer.parseInt(S[0]);
    int A = Integer.parseInt(S[1])-1;
    int B = Integer.parseInt(S[2])-1;
    int C = Integer.parseInt(S[3])-1;
    int D = Integer.parseInt(S[4])-1;
    
    String T = sc.nextLine();
    char[] f = new char[N];
    
    for(int i = 0; i < N; i++){
      f[i] = T.charAt(i);
    }
    
    for(int i = A; i < C; i++){
      if(f[i] == '#' && f[i+1] == '#'){
        System.out.println("No");
        return;
      }
    }
    for(int i = B; i < D; i++){
      if(f[i] == '#' && f[i+1] == '#'){
        System.out.println("No");
        return;
      }
    }
    
    if(C<D){
      System.out.println("Yes");
      return;
    }
    
    boolean pass = false;
    if(A+1 == B && f[A+2] == '.'){
      pass = true;
    }
    
    for(int i = B; i <= D-2; i++){
      if(f[i] == '.' && f[i-1] == '.' && f[i+1] == '.'){
        pass = true;
      }
    }
    
    if(pass){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}