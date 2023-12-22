import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		String s = scn.next();
		String[] list = s.split("");
      	 if(s.length()%2==1){
     	 System.out.println("No");
           return;
         }else{
      	Arrays.sort(list);
      	String x = list[0];
      	int count = 0;
      	for(int i=0;i<s.length();i++){
        if(x.equals(list[i])){
          count++;
        }else{
          if(count%2==1){
            System.out.println("No");
            return;
          }
          count = 1;
          x = list[i];
        }
        }
      	System.out.println("Yes");
    }
	}
}
