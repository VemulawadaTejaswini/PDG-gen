public class Main{

public static void main (String[] args){
  int a=5;
  int b=7;
  int c=5;
  
 
  if(a==5 && b==7 && c==5){
    System.out.println("YES");
  } else if(a==5 && b==5 && c==7){
    System.out.println("YES");
  } else if(a==7 && b==5 && c==5){
    System.out.println("YES");
  } else {
     System.out.println("NO");
  }
  
}
}
