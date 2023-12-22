import java.util.Scanner;

class Main{
	int X;

  public static void main(String[] ar){
    new Main();
  }
  public Main(){
  	Scanner sc=new Scanner(System.in);
  	String line=sc.nextLine();
  	X=Integer.parseInt(line);  	
  	//System.out.println(X);
  	
    System.out.println((int)Math.pow((Math.sqrt(X)), 2));
  }
}