import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		String S=stdIn.next();
		int z=0;
		boolean fin=false;
		boolean we=false;
		while(z<S.length()){
			char a=S.charAt(z);
			if(z%2==0)
				if(a=='R'||a=='U'||a=='D')
					we=true;
				else
					fin=true;
			if(z%2==1)
				if(a=='L'||a=='U'||a=='D')
					we=true;
				else
					fin=true;
			z++;
		}
		if(fin)
			System.out.println("No");
		else
			System.out.println("Yes");
	}
}