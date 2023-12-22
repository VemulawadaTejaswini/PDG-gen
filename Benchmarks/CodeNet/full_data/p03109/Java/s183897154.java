import java.util.*;
 
class Main {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
      String oll = sc.next();
      int flag = 0;


      String y = oll.substring(0, 4);
      String m = oll.substring(5, 7);
		
      int ye = Integer.parseInt(y);
      int mo = Integer.parseInt(m);
      
      if(ye<=2018){flag=1;}
      if(ye<=2019&&mo<=4){flag=1;}

		if(flag==1){System.out.print("Heisei");}
      else{System.out.print("TBD");}


 
    }
}