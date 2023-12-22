import java.util.*;
public class Main{
 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  int a=sc.nextInt();
  int b=sc.nextInt();
  String c[] =new String[a];
  for(int i=0;i<a;i++){
   c[i]=sc.next();
  }
  Arrays.sort(c);
  for(int i=0;i<a;i++){
   System.out.print(c[i]);
  }
 }
}
