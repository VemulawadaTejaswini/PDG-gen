import java.io.*; 
import java.util.Scanner;

public class Main {
	
	static InputReader in = new InputReader(System.in);

	public static void main(String[] args){
		int Ph = in.nextInt();
      	int Qh = in.nextInt();
      	int Rh = in.nextInt();
      
      	if(Ph<Qh && Qh < Rh){ System.out.println(Ph+Qh); }
        if(Ph<Rh && Rh < Qh){ System.out.println(Ph+Rh); }
      	if(Qh<Ph && Ph < Rh){ System.out.println(Qh+Ph); }
      	if(Qh<Rh && Rh < Ph){ System.out.println(Qh+Rh); }
      	if(Rh<Ph && Ph < Qh){ System.out.println(Rh+Ph); }
      	if(Rh<Qh && Qh < Ph){ System.out.println(Rh+Qh); }
      
	}
}


	
