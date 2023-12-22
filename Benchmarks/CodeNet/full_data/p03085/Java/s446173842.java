import java.util.*;

class Main{
  public static void main(String args[]){

    Scanner sc = new Scanner(System.in);

    String str = sc.nextLine();

    if(str == "A"){
      System.out.println("T");
    }
    else if(str == "C"){
      System.out.println("G");
    }
    else if(str == "G"){
      System.out.println("C");
    }
    else{
      System.out.println("A");
    }
  }
}
    
