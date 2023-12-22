import java.util.Scanner;
 
public class password{
  public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number : ");
    int i = input.nextInt();
    int first;
    int second;
    int third;
    int pw = 0;
    int count = 0;
    if(i < 1 || i > 9) {
    	System.out.println("Error!");
    }else {
    	for(int j = 1; j <= i; j++) {
        	first = j * 100;
        	for(int k = 1; j <= i; k++) {
        		second = k * 10;
        		for(int l = 1; l <= i; l++) {
        			third = l * 1;
        			pw = first+second+third;
        			System.out.println(pw);
        			count++;
        			if(l == i) break;
        		}
        		if(k == i) break;
        	}
        	if(j == i) break;
        }
    System.out.println("Number of PassWord : "+count);
    }
  }
}