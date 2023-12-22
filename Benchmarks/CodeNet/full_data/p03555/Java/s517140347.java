import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    String[][] c = new String[2][3];
    String[] str = new String[2];
    
    for(int i=0; i++; i<2){
      str[i] = sc.next();
      for(int j=0; j++; j<3){
        c[i][j] = str[i].charAt(j);
      }
    }

    
    if(c[0][0]==c[1][2] && c[0][1]==c[1][1] && c[0][2]==c[1][0]){
      System.out.println("YES");
    }
    else{
      System.out.println("NO");
    }
  }
}
      
      