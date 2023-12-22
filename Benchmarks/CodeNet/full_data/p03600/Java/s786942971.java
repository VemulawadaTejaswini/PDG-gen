
import java.util.Scanner;

public class Main{
 public static void main(String[] args){
  Scanner scanner=new Scanner(System.in);
  int n=scanner.nextInt();
  long[][] a=new long[n][n];
  int[][] order=new int[n*(n-1)/2][2];
  int last=0;
  for(int i=0;i<n;i++){
   for(int j=0;j<n;j++){
    int distance=scanner.nextInt();
    a[i][j]=distance;
    if((i==j&&a[i][j]!=0)||(i>j&&a[i][j]!=a[j][i])){
     System.out.println("-1");
     return;
    }
    if(j>i){
     order[last]=new int[]{i,j};
     for(int k=last;k>0&&distance<a[order[k-1][0]][order[k-1][1]];k--){
      int[] swap=order[k-1];
      order[k-1]=order[k];
      order[k]=swap;
     }
     last++;
    }
   }
  }
  scanner.close();
  long[][] connection=new long[n][n];
  long[][] shortest=new long[n][n];
  for(int[] pair:order){
   int i=pair[0];
   int j=pair[1];
   if(shortest[i][j]==0||a[i][j]<shortest[i][j]){// unconnected or too far
    connection[i][j]=a[i][j];
    connection[j][i]=a[i][j];
    shortest[i][j]=a[i][j];
    shortest[j][i]=a[i][j];
    for(int x=0;x<n;x++){
     if(x!=i&&shortest[x][i]==0) continue;
     for(int y=x+1;y<n;y++){
      if(y!=j&&shortest[j][y]==0) continue;
      long path=shortest[x][i]+shortest[i][j]+shortest[j][y];
      if(shortest[x][y]==0||path<shortest[x][y]){
       shortest[x][y]=path;
       shortest[y][x]=path;
      }
     }
    }
    for(int x=0;x<n;x++){
     if(x!=j&&shortest[x][j]==0) continue;
     for(int y=x+1;y<n;y++){
      if(y!=i&&shortest[i][y]==0) continue;
      long path=shortest[x][j]+shortest[j][i]+shortest[i][y];
      if(shortest[x][y]==0||path<shortest[x][y]){
       shortest[x][y]=path;
       shortest[y][x]=path;
      }
     }
    }
   }else if(a[i][j]>shortest[i][j]){
    System.out.println("-1");
    return;
   }
  }
  long sum=0;
  for(int i=0;i<n;i++){
   for(int j=i+1;j<n;j++){
    sum+=connection[i][j];
   }
  }
  System.out.println(sum);
 }
 protected static String matrix(int[][] matrix,int n){
  StringBuffer stringBuffer=new StringBuffer();
  for(int i=0;i<n;i++){
   for(int j=0;j<n;j++){
    stringBuffer.append(matrix[i][j]+" ");
   }
   stringBuffer.append("\n");
  }
  return stringBuffer.toString();
 }
}
