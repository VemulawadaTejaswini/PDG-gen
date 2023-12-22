import java.util.Scanner; //bhjnkhgbcvxbftvgybhgyvftvghbjdsgyfbhjnhgyvhb
public class Main //aaaaaa
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long n = scan.nextLong();
		if(n%2==1){
		    System.out.println(0);
		}
		else{
		    long total = 0;
		    long x = n/2;
		    do{
		        x = (long) Math.floor(x/5); 
		        total += x;
		    }while(x>0);
		    System.out.println(total);
		}
	}
}
