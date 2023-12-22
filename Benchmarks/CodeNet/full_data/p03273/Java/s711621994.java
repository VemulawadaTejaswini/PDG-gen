import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int h=scanner.nextInt();
		int w=scanner.nextInt();
	
		String gr[][]=new String[h][w];
		for(int i=0;i<h;i++){
			gr[i]=scanner.next().split("");
		}
		
		boolean dotH[]=new boolean [h];
		boolean dotW[]=new boolean [w];
		for(int i=0;i<h;i++){
			if(gr[i][0].equals(".")){
				for(int j=1;j<w;j++){
					if(gr[i][j].equals("."))dotH[i]=true;
					else{
						dotH[i]=false;
						break;
					}
				}
			}
		}
		for(int i=0;i<w;i++){
			if(gr[0][i].equals(".")){
				for(int j=1;j<h;j++){
					if(gr[j][i].equals("."))dotW[i]=true;
					else{
						dotW[i]=false;
						break;
					}
				}
			}
		}
		
		for(int i=0;i<h;i++){
			if(dotH[i])continue;
			for(int j=0;j<w;j++){
				if(dotW[j])continue;
				System.out.print(gr[i][j]);
			}
			System.out.println("");
		}
	}
}