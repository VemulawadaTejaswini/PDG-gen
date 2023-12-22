import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int[][] array = new int[3][3];
    String ans = "No";
    for(int i = 0; i < 3; i++){
      array[i][0] = Integer.parseInt(sc.next());
      array[i][1] = Integer.parseInt(sc.next());
      array[i][2] = Integer.parseInt(sc.next());
    }
    int n = Integer.parseInt(sc.next());
    
    for(int k = 0; k < n; k++){
     int bin = Integer.parseInt(sc.next());
      for(int i = 0; i < 3; i++){
        for(int j = 0; j < 3; j++){
          if(array[i][j] == bin){
            array[i][j] = 0;
          }
        }
      }
    }
    if((array[0][0]==0&&array[0][1]==0&&array[0][2]==0)||(array[1][0]==0&&array[1][1]==0&&array[1][2]==0)||(array[2][0]==0&&array[2][1]==0&&array[2][2]==0)){
    ans = "Yes";
  }
    if((array[0][0]==0&&array[1][0]==0&&array[2][0]==0)||(array[0][1]==0&&array[1][1]==0&&array[2][1]==0)||(array[0][2]==0&&array[1][2]==0&&array[2][2]==0)){
    ans = "Yes";
  }
  if((array[0][0]==0&&array[1][1]==0&&array[2][2]==0)||(array[0][2]==0&&array[1][1]==0&&array[0][2]==0)){
    ans ="Yes";
  }
  System.out.println(ans);
}
}
