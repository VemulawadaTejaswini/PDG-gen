import java.util.*;
class Main{
public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  String s=sc.next();
  String[] a=s.split("");
  String c="Yes";
  for(int n=0;n<a.length;n++){
  if(n%2==0&&a[n].equals("L")){c="No";} 
  if(n%2==1&&a[n].equals("R")){c="No";}
  }
 
  System.out.println(c);
  
  
}

}