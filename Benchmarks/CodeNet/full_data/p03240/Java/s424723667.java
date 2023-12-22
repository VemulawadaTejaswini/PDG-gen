import java.util.*;
 
public class Main{
  public static void main(String[]args){
    Scanner sc =  new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    int ax = 0;
    int ay = 0;
    int ah = 0;
    int c = 0;
    while(true){
      String[] S = sc.nextLine().split(" ");
      ax = Integer.parseInt(S[0]);
      ay = Integer.parseInt(S[1]);
      ah = Integer.parseInt(S[2]);
      c++;
      if(ah > 0){
        break;
      }
    }
    
    int[][] val = new int[N-c][3];
    for(int i = 0; i < N-c; i++){
      String[] S = sc.nextLine().split(" ");
      val[i][0] = Integer.parseInt(S[0]);
      val[i][1] = Integer.parseInt(S[1]);
      val[i][2] = Integer.parseInt(S[2]);
    }
    
    for(int i = 0; i <= 100; i++){
      con : for(int j = 0; j <= 100; j++){
        int H = Math.abs(i-ax) + Math.abs(j-ay) + ah;
        for(int k = 0; k < N-c; k++){
	      int x = val[k][0];
    	  int y = val[k][1];
       	  int h = val[k][2];
          if(Math.abs(i-x) + Math.abs(j-y) + h != H){
            continue con;
          }
        }
        System.out.println(i+" "+j+" "+H);
        return;
      }
    }
  }
}