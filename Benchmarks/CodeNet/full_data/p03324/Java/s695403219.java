import java.util.Scanner;

public class Main{
	public static int divisble(int n) {
		if(n/100==0) {
			return 0;
		}
		return 1+divisble(n/100);
	}
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		String temp = input.nextLine();
		int toReturn=0;
		int d=Integer.parseInt(temp.substring(0, temp.indexOf(" ")));
		int num=Integer.parseInt(temp.substring(temp.indexOf(" ")+1));
		int count=0;
		int tempe=1;
		while(count!=d) {
			tempe*=10;
			count=divisble(tempe);
		}
		for(int x=0;x<num;x++) {
			toReturn+=tempe;
		}
		if(num==100) {
			toReturn+=tempe;
		}
		System.out.println(toReturn);
		input.close();
		
	}
	

}
