import java.util.Scanner;
public class Main{
 public static void main(String[] args) {
   Scanner kbd = new Scanner(System.in);
   int n=kbd.nextInt();
   String a=kbd.next();
   int[] retu = new int[n+1];
   for(int i=0;i<n;i++){
     int p=a.charAt(i)-48;
     retu[i]=p;
}
   int l=n;
   int[] retu2 = new int[n+1];
for(int y=0;y<n-2;y++){
  for(int i=0;i<n;i++){
  int x=retu[i]-retu[i+1];
  if(x>0){
    retu2[i]=x;
  }else{
    retu2[i]=-x;
  }
}
for(int i=0;i<n;i++){
retu[i]=retu2[i];
System.out.println(retu[i]);
}
retu[l]=retu[l-1];
l=l-1;
}
System.out.println(retu[0]);
}
}