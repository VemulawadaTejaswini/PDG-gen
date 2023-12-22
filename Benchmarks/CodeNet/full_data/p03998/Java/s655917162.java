import java.util.Scanner;

class Main{


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		String AA = sc.next();
		String BB = sc.next();
		String CC = sc.next();
		
		
		StringBuilder A = new StringBuilder(AA);
		StringBuilder B = new StringBuilder(BB);
		StringBuilder C = new StringBuilder(CC);

		
		String player = "A";
		while(true){
			//System.out.println(player);
			
			if(player == "A"){
				if(A.length() == 0){
					System.out.println("A");
					return;
				}
				
				if(A.charAt(0) == 'a'){
					player = "A";
					A = A.deleteCharAt(0);
				}else if(A.charAt(0) == 'b'){
					player = "B";
					A = A.deleteCharAt(0);
				}else if(A.charAt(0) == 'c'){
					player = "C";
					A = A.deleteCharAt(0);
				}
				
			}else if(player == "B"){
				if(B.length() == 0){
					System.out.println("B");
					return;
				}
				
				if(B.charAt(0) == 'a'){
					player = "A";
					B = B.deleteCharAt(0);
				}else if(B.charAt(0) == 'b'){
					player = "B";
					B = B.deleteCharAt(0);
				}else if(B.charAt(0) == 'c'){
					player = "C";
					B = B.deleteCharAt(0);
				}
				
				
			}else if(player == "C"){
				if(C.length() == 0){
					System.out.println("C");
					return;
				}
				
				if(C.charAt(0) == 'a'){
					player = "A";
					C = C.deleteCharAt(0);
				}else if(C.charAt(0) == 'b'){
					player = "B";
					C = C.deleteCharAt(0);
				}else if(C.charAt(0) == 'c'){
					player = "C";
					C = C.deleteCharAt(0);
				}
				
				
			}
			
		}
		
	}
}