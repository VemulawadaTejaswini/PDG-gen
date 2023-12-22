import java.util.*;

public class Main{
	
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	char a=sc.next().charAt(0),b=sc.next().charAt(0);
    int na=0,nb=0;
    if(a=='H'){
      na=1;
    }else{na=-1;}
    if(b=='D'){
      nb=1;
    }else{nb=-1;}
    if(a*b>0){
      System.out.println('H');
    }else{
      System.out.println('D');
    }
  }
}
