import java.util.*;
 class Main{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int HP = sc.nextInt();
    int N = sc.nextInt();
    int total = 0;
    for(int i=0; i < N; i++){
      total += sc.nextInt();
    }
    if(HP <= total ){ System.out.println("Yes");}
    else{ System.out.println("No");}
    
  }
 
 
 
}