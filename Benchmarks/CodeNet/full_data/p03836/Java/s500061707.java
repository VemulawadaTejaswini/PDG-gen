import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		int sx=stdIn.nextInt();
		int sy=stdIn.nextInt();
		int tx=stdIn.nextInt();
		int ty=stdIn.nextInt();
		boolean fin=false;
		int x=sx,y=sy;
		while(true){
			if(x==tx)
				break;
			if(x<tx){
				System.out.print("R"); x++;
			}
			else{
				System.out.print("L"); x--;
			}
		}
		while(true){
			if(y==ty)
				break;
			if(y<ty){
				System.out.print("U"); y++; fin=true;
			}
			else{
				System.out.print("D"); y--; fin=false;
			}
		}
		if(fin){
			System.out.print("U"); y++;
		}
		else{
			System.out.print("D");y--;
		}
		while(true){
			if(x==sx)
				break;
			if(x<sx){
				System.out.print("R"); x++; fin=true;
			}
			else{
				System.out.print("L"); x--; fin=false;
			}
		}
		if(fin){
			System.out.print("R"); x++;
		}
		else{
			System.out.print("L");x--;
		}
		while(true){
			if(y==sy)
				break;
			if(y<sy){
				System.out.print("U"); y++;
			}
			else{
				System.out.print("D"); y--;
			}
		}
		if(fin){
			System.out.print("L"); x--;
		}
		else{
			System.out.print("R");x++;
		}
		while(true){
			if(y==ty)
				break;
			if(y<ty){
				System.out.print("U"); y++;
			}
			else{
				System.out.print("D"); y--;
			}
		}
		while(true){
			if(x==tx)
				break;
			if(x<tx){
				System.out.print("R"); x++; fin=true;
			}
			else{
				System.out.print("L"); x--; fin=false;
			}
		}
		if(fin){
			System.out.print("R"); x++;
		}
		else{
			System.out.print("L");x--;
		}
		while(true){
			if(y==sy)
				break;
			if(y<sy){
				System.out.print("U"); y++; fin=true;
			}
			else{
				System.out.print("D"); y--; fin=false;
			}
		}
		if(fin){
			System.out.print("U"); y++;
		}
		else{
			System.out.print("D");y--;
		}
		while(true){
			if(x==sx)
				break;
			if(x<sx){
				System.out.print("R"); x++;
			}
			else{
				System.out.print("L"); x--;
			}
		}
		if(fin){
			System.out.print("D"); y--;
		}
		else{
			System.out.print("U");y++;
		}
	}
}
