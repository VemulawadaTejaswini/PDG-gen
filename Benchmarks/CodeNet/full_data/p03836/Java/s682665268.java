import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int sx = sc.nextInt(); int sy = sc.nextInt();
	int tx = sc.nextInt(); int ty = sc.nextInt();
	
	StringBuilder a = new StringBuilder();
	 a.append(move1(sx,tx,sy,ty)); 
	 a.append(move2(sx,tx,sy,ty)); 
	 a.append(move3(sx,tx,sy,ty)); 
	 a.append(move4(sx,tx,sy,ty)); 
     
	 
	 String ans = a.toString();
	 System.out.println(ans);
}

	static String move1 (int sx,int tx,int sy,int ty) {
	StringBuilder mm = new StringBuilder(); 

	for(int i=0; i<Math.abs(sx-tx);i++) {
		 mm.append("R");}
	for(int i=0; i<Math.abs(sy-ty);i++) {
		mm.append("U");}
	
		String m = mm.toString();
		 return m;
	}
	static String move2 (int sx,int tx,int sy,int ty) {
		StringBuilder mm = new StringBuilder(); 

		for(int i=0; i<Math.abs(sx-tx);i++) {
			 mm.append("L");}
		for(int i=0; i<Math.abs(sy-ty);i++) {
			mm.append("D");}
		
			String m = mm.toString();
			 return m;
		}
	static String move3 (int sx,int tx,int sy,int ty) {
		StringBuilder mm = new StringBuilder(); 
		 mm.append("D");
		for(int i=0; i<Math.abs(sx-tx)+1;i++) {
			 mm.append("R");}
		for(int i=0; i<Math.abs(sy-ty)+1;i++) {
			mm.append("U");}
		mm.append("L");
			String m = mm.toString();
			 return m;
		}
	static String move4 (int sx,int tx,int sy,int ty) {
		StringBuilder mm = new StringBuilder(); 
        mm.append("U");
		for(int i=0; i<Math.abs(sx-tx);i++) {
			 mm.append("L");}
		for(int i=0; i<Math.abs(sy-ty);i++) {
			mm.append("D");}
		mm.append("R");
			String m = mm.toString();
			 return m;
		}
	
}
