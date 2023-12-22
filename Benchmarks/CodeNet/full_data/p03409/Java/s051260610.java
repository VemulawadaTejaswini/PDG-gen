import java.util.*;
 class Node{
public int x;
public int y;
  public Node(){
x=0;
y=0;}
}   
public class Main{
  static int[][] line=new int[122][122];
     static int[] used=new int[122];
     static int[] linker=new int[122];
     static int n;
     public static void main(String[] args){
         Scanner in = new Scanner(System.in);
         n=in.nextInt();
         Node[] a=new Node[122];
     Node[] b=new Node[122];
    for(int i=0;i<a.length;i++){
      a[i]=new Node();
     b[i]=new Node();               
}    
for(int i = 0; i<n;i++){ a[i].x=in.nextInt(); a[i].y=in.nextInt();}
         for(int i = 0; i<n;i++){ b[i].x=in.nextInt(); b[i].y=in.nextInt();}     
         for(int i=0;i<n;i++)
          for(int j=0;j<n;j++){
             if(a[i].x<=b[j].x && a[i].y<=b[j].y)
               line[i][j]=1;
        }
       System.out.println(hungary());
     }
   public static int hungary(){
   int sum=0;
  for(int i=0; i<n;i++){
     for(int j=0;j<n;j++)
         used[j]=0;
      if(find(i)) sum++;
}
return sum;
}
 private static boolean find(int x){
for(int i=0;i<n;i++){
if(line[x][i]==1 && used[i]==0){
used[i]=1;
if(linker[i]==0 || find(linker[i])){
linker[i]=x;
return true;
}
}
}
return false;}

    }