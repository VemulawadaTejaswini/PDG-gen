import java.util.*;
public class Main {
  public static void main(String args[]) {
  	Scanner scan = new Scanner(System.in);
    String string = scan.next();
    String text = scan.next();
    int row = string.length()+1;
    int col = text.length()+1;
    int[][] lcs = new int[row][col];
    char[][] backtrack = new char[row][col]; 
    for(int i=1; i<row; i++) {
      for(int j=1; j<col; j++) {
        if(string.charAt(i-1)==text.charAt(j-1)) {
          lcs[i][j]=lcs[i-1][j-1]+1;
          backtrack[i][j]='D';
        }else{
          lcs[i][j]=Math.max(lcs[i-1][j],lcs[i][j-1]);
          backtrack[i][j] = lcs[i-1][j]>lcs[i][j-1] ? 'U' : 'R';
        }
      }
    }
    String match = printSequence(backtrack,row-1,col-1,text);
    System.out.println(match);
  }
  
  public static String printSequence(char[][] path, int i, int j, String text) {
  	if(i==0||j==0){
      return "";
    }else if(path[i][j]=='D') {
      return printSequence(path,i-1,j-1,text)+text.charAt(j-1);
    }else if(path[i][j]=='U') {
      return printSequence(path,i-1,j,text);
    }else{
      return printSequence(path,i,j-1,text);
    }
  }  
}