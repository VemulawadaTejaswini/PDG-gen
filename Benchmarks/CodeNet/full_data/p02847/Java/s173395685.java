import java.util.Scanner;
 
class Unchi {
  public static void main(String[] args) {
 
    Scanner S = new Scanner(System.in);
    String str = S.next();
    int h;
 
    if(str == "SUN") System.out.print("7");
      else if(str == "MON") System.out.print("6");
      else if(str == "TUE") System.out.print("5");
      else if(str == "WED") System.out.print("4");
      else if(str == "THU") System.out.print("3");
      else if(str == "FRI") System.out.print("2");
 	  else if(str == "SAT") System.out.print("1");
    
  }
}