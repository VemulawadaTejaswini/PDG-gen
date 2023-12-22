import java.util.*;

public class Main{
public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int[][] a=new int[3][3];
  for(int i=0;i<3;i++){
    for(int j=0;j<3;j++){
      a[i][j]=sc.nextInt();
    }
  }
  boolean[][] b=new boolean[3][3];
  for(int i=0;i<3;i++){
    for(int j=0;j<3;j++){
      b[i][j]=false;
    }
  }
  int n=sc.nextInt();
  int[] c=new int[n];
  for(int i=0;i<n;i++){
    c[i]=sc.nextInt();
  }
  for(int k=0;k<n;k++){
    for(int i=0;i<3;i++){
      for(int j=0;j<3;j++){
        if(a[i][j]==c[k]){
          b[i][j]=true;
        }
      }
    }
  }
  if(b[0][0]==b[0][1] && b[0][1]==b[0][2]){
    System.out.println("Yes");
  }else if(b[1][0]==b[1][1] && b[1][1]==b[1][2]){
    System.out.println("Yes");
  }else if(b[2][0]==b[2][1] && b[2][1]==b[2][2]){
    System.out.println("Yes");
  }else if(b[0][0]==b[1][0] && b[1][0]==b[2][0]){
    System.out.println("Yes");
  }else if(b[0][1]==b[1][1] && b[1][1]==b[2][1]){
    System.out.println("Yes");
  }else if(b[0][2]==b[1][2] && b[1][2]==b[2][2]){
    System.out.println("Yes");
  }else if(b[0][0]==b[1][1] && b[1][1]==b[2][2]){
    System.out.println("Yes");
  }else if(b[0][2]==b[1][1] && b[1][1]==b[2][0]){
    System.out.println("Yes");
  }else{
    System.out.println("No");
  }
}
}