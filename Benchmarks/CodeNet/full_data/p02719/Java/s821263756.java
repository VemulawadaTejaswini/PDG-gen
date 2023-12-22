import java.util.*;
public class Main{
  public static void main(String[] args){
	  Scanner s = new Scanner(System.in);
	  int n = s.nextInt();
	  int k = s.nextInt();
	  
	  int min = Math.abs(n-k);
	 
	  while (true) {
		  int temp = Math.abs(min - k);
		  if (temp < min)
			  min = temp;
		  else if (temp > min)
			  break;
	  }
	  System.out.println(min);
  }
	

}
