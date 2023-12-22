import java.util.Scanner;
class Main{
  public static void main(String[] args){
  Scanner inp=new Scanner(System.in);
  String a=inp.next();
  int b=1;
  while(a.charAt(b-1)!='C'&&b<a.length()){
    b++;
  }
  if(b>a.length()){
    while(a.charAt(b-1)!='F'&&b<a.length()){
      b++;
    }
  }
  if(b>=a.length()){
    a="No";
  }else{
    a="Yes";
  }
 
  System.out.println(a);
  }
}