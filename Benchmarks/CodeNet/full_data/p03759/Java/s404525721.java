import java.util.Scanner;

public class main{
	public static void main (String[] args){
	Scanner scan = new Scanner(System.in);

	String kisupas = scan.nextLine();
	String gusupas = scan.nextLine();
	
	String[] kisu = kisupas.split("", 0);
	String[] gusu = gusupas.split("", 0);

	for(int i=0; i<kisu.length; i++){
	System.out.print(kisu[i]);
	if(i != gusu.length)
	System.out.print(gusu[i]);	
	}
	}
    
}