import java.util.*;
class Main{
  public static void main(String[] a ){
    Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int m=sc.nextInt();
int x=sc.nextInt();
int y=sc.nextInt();
int maxX=Integer.MIN_VALUE;
minY=Integer.MAX_VALUE;
for(int i=0;i<n;i++){
maxX=Math.max(maxX,sc.nextInt());
}
for(int i=0;i<m;i++){
minY=Math.min(minY,sc.nextInt());
}
if(maxX<minY&&(maxX<y||minY>x){
System.out.println("No war");
}else{
System.out.println("War");
}}}