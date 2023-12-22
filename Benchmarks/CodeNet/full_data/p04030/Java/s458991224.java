import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		String s = scn.next();
		String[] list = s.split("");
      	String ans = "";
      	if(s.length()==1){
          ans = s;
        }else{
          for(int i=1; i<s.length(); i++){ 
            if(i>5){
            if(list[i].equals("B") && list[i-1].equals("B")&& list[i-2].equals("B")&& list[i-3].equals("B")&& list[i-4].equals("B")){
              list[i-7]="2";
            }
            }
			if(list[i].equals("B")){
              list[i-1]="2";
              list[i]="2";
            }
		  }
          if(list[0].equals("B")) list[0]="2";
          for(int i=0; i<s.length(); i++){
            if(!(list[i].equals("2"))) ans+=list[i];
          }
          
        }
      	System.out.println(ans);
	}
}
