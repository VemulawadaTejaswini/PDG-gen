import java.util.Scanner;
 
public class Main {
	public static void main(String[] args){
	long  x,i,j,rem=0;
	Scanner num = new Scanner(System.in);
	x = num.nextLong();
        i= x/11;
        j= x%11;
        if(j>6){
        rem = rem +2;
        }else{
        rem = rem +1;
        }
        if(j == 0){
        rem = 0;
        }
        
        x = i*2 + rem;
        System.out.print(x);
        }
}        