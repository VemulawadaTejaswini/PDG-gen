import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
//    int x=sc.nextInt();
//    int a=sc.nextInt();
//    int b=sc.nextInt();
    int z=0;
    for(int i=0;i<4;i++){
      if(s.charAt(i)=='+'){
        z++;
      }else{
        z--;
      }
    }
    System.out.println(z);
  }
}