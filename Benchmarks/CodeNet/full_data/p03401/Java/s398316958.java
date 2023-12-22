import java.util.*;

public class Main {
public static void main(String[] args){
  Scanner in=new Scanner(System.in);
  int n=in.nextInt();
  int[] a=new int[n+1];
  int[] b=new int[n];
  a[0]=0;
  for(int i=1;i<=n;i++){
   a[i]=in.nextInt();
}
for(int i=1;i<=n;i++){
for(int j=0;j<n;j++){
if(j+1==i && j<n-1){
b[i-1]+=Math.abs(a[j+2]-a[j]);
j++;}
else if(j+1==i && i==n){b[i-1]+=Math.abs(a[n-1]);}
else{b[i-1]+=Math.abs(a[j+1]-a[j]);}
}
}
for(int i=0;i<n-1;i++){
b[i]+=Math.abs(a[n]);
System.out.println(b[i]);
}
System.out.println(b[n-1]);

}
}