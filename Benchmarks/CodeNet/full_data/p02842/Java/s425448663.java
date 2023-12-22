import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int x = (int)n/1.08;
      	int check = 0;
      	if(x*1.08==n){
          check=1;
          System.out.println(x);
        }else if((x-1)*1.08==n){
          check=1;
          System.out.println(x-1);
        }if((x+1)*1.08==n){
          check=1;
          System.out.println(x+1);
        }else{
          System.out.println(":(");
        }
	}
}
