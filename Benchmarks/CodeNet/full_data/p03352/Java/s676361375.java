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
  	
    int E=0;
    for(double r=2;r<=10;r++){
      int a=(int)Math.pow((int)Math.pow(X+0.1, 1.0/r), r);
      if(E<a) E=a;
    } 
    System.out.println(E);
  }
}