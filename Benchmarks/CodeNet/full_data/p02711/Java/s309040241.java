import java.util.Scanner;
//import java.util.Random;

class a{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		
		String s=stdIn.next();
		for(int i=0;i<3;++i){
			if(s.charAt(i)=='7'){
				System.out.println("Yes");
				return;
			}
		}
		
		System.out.println("No");
	}
}