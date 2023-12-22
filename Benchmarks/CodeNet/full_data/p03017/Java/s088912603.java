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
    char[] field = new char[N];
    
    for(int i = 0; i < N; i++){
      field[i] = T.charAt(i);
    }
    
    boolean rock2 = false;
    for(int i = A; i < C; i++){
      if(field[i] == '#' && field[i+1] == '#'){
        rock2 = true;
      }
    }
    for(int i = B; i < D; i++){
      if(field[i] == '#' && field[i+1] == '#'){
        rock2 = true;
      }
    }
    if(rock2){
      System.out.println("No");
      return;
    }
    
    if(C < D){
      System.out.println("Yes");
      return;
    }
    
    boolean tri_check = false;
    int num = 0;
    if(A+1 == B){
      num = A;
    }else{
      num = B;
    }
    for(int i = num; i <= D-2; i++){
      if(field[i] == '.' && field[i+1] == '.' && field[i+2] == '.'){
        tri_check = true;
        break;
      }
    }
    
    boolean near_check = false;
    if(field[D-1] == '#' || field[D+1] == '#'){
      near_check = true;
    }
    
    if(tri_check){
      System.out.println("Yes");
    }else if(near_check){
      System.out.println("No");
    }else{
      System.out.println("Yes");
    }
  }
}