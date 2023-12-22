import java.util.Scanner;

public class Main {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		StringBuilder SA = new StringBuilder();
		StringBuilder SB = new StringBuilder();
		StringBuilder SC = new StringBuilder();
		
		String A = scan.next();
		String B = scan.next();
		String C = scan.next();
		
		
		SA.append(A);
		SB.append(B);
		SC.append(C);
		
		String turn = "A";
		int end = 0;
		String Winner= "o";
		
		
		do{
			switch(turn){
			case "A":
				
				if(SA.toString().equals("")){
					Winner = "A";
					end=1;
					
				}else
				if(SA.toString().substring(0, 1).equals("a")){//文字列一番目を切り取りそれがaか判別
					turn = "A";
					SA.delete(0, 1);
					
				}else if(SA.toString().substring(0, 1).equals("b")){
					turn = "B";

					SA.delete(0, 1);

				}else if(SA.toString().substring(0, 1).equals("c")){
					turn = "C";

					SA.delete(0, 1);

				}
				break;
				
			case "B":
				if(SB.toString().equals("")){
					Winner = "B";
					end=1;
					
				}else
				if(SB.toString().substring(0, 1).equals("a")){
					turn = "A";
					SB.delete(0, 1);
					
				}else if(SB.toString().substring(0, 1).equals("b")){
					turn = "B";

					SB.delete(0, 1);

				}else if(SB.toString().substring(0, 1).equals("c")){
					turn = "C";

					SB.delete(0, 1);

				}
				break;
			case "C":
				if(SC.toString().equals("")){
					Winner = "C";
					end=1;
					
				}else
				if(SC.toString().substring(0, 1).equals("a")){
					turn = "A";
					SC.delete(0, 1);
					
				}else if(SC.toString().substring(0, 1).equals("b")){
					turn = "B";

					SC.delete(0, 1);

				}else if(SC.toString().substring(0, 1).equals("c")){
					turn = "C";

					SC.delete(0, 1);

				}
				break;
			
			}
			
			
			
			
		}while(end==0);
		
		
		
		
		
		System.out.println(Winner);
		
		
		
		
		
		
	}

}