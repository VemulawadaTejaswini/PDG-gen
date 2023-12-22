import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		long  h =scn.nextLong();
		long w = scn.nextLong();
		
		long val=0;
		if(h==1 || w==1){
			System.out.println("1");
			return;
		}
		val=w*h;
		if(val%2!=0){
			val=val/2;
			val+=1;
			System.out.println(val);
		}else{
			val=val/2;
			System.out.println(val);
		}

	}

}