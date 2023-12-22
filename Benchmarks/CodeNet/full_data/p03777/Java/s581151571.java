import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
	Scanner scn = new Scanner(System.in);
	String a = scn.next();
      String b = scn.next();
      int check = 0;
      if(a=="H"){
       if(b=="D"){
         check=1;
       }
      }
      if(a=="D"){
       if(b=="H"){
         check=1;
       }
      }
      if(check==1){
        System.out.println("D");
      }else{
        System.out.println("H");
      }
	}
}