import java.util.Scanner;


public class Main {
	
	public static int oRank,tRank,jRank=0;
	
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		String str1 = reader.nextLine();
		
		String[] fLine = str1.split(" ");
		int N =Integer.parseInt(fLine[0]);
		int A =Integer.parseInt(fLine[1]);
		int B =Integer.parseInt(fLine[2]);
		
		String sLine = reader.nextLine();
		
		for (char s: sLine.toCharArray()){
			if(s == 'a'){
				if(tRank<A+B){
					jRank++;
					tRank++;
					System.out.println("Yes");
				}
				else
					System.out.println("No");
			}
			else if (s == 'b'){
				
				if(tRank<A+B && oRank<B){
					oRank++;
					tRank++;
					System.out.println("Yes");
				}
				else
					System.out.println("No");
			}
			else if (s == 'c')
				System.out.println("No");
		}
	}
}
