import java.util.Scanner;

class Main{
  public static void main(String args[]){
    
    Scanner scan = new Scanner(System.in);
    int number = Integer.parseInt(scan.next());
	
	int i = 1;
    while (i < number){
        if((i*i <= number) && ((i+1)*(i+1) > number)){
        	System.out.println(i*i);
        	break;
        }
        i++;
    }
	return;
  }
}