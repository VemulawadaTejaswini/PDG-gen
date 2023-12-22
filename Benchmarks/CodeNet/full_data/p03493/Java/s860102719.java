import java.util.*;

class Main{
  public static void main(String[] args){
    int x = 0;
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    sc.close();
    for(int i=0;i<3;i++){
      if(s.substring(i+1,i+1) == "1"){
        x++;
      }
    }
    System.out.println(x);
  }
}
