import java.util.Scanner;
import java.util.stream.IntStream;
 
public class Main{
	static final Scanner s=new Scanner(System.in);
	static int getInt(){
		return Integer.parseInt(s.next());
	}
	static IntStream REPS(int r){
		return IntStream.range(0,r);
	}
	public static void main(String[] __){
		int h=getInt(),w=getInt();
		char[][]f=REPS(h).mapToObj(i->s.next().toCharArray())
				.toArray(char[][]::new);
		for(int x=0;x<w;x++)for(int y=0;y<h;y++)if(f[y][x]=='#'){
			boolean bx=x<w-1&&f[y][x+1]=='#';
			boolean by=y<h-1&&f[y+1][x]=='#';
			
			if(bx==by) {
				System.out.println("Impossible");
				return;
			}
			if(bx)
				x++;
			if(by)
				y++;
			f[y][x]='.';
		}
		System.out.println("Possible");
	}
}