import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		String S=stdIn.next();
		int N=S.length();
		int max=0;
		for(int i=1;i<=N;i++){
			for(int j=0;j+i<=N;j++){
				String a=S.substring(j,j+i);
				boolean key=true;
				for(int k=0;k<a.length();k++){
					char b=a.charAt(k);
					if((b=='A'||b=='C'||b=='G'||b=='T')==false)
						key=false;
				}
				if(key&&i>max)
					max=i;
			}
		}
		System.out.println(max);
	}
}
