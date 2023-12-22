import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception{
		Scanner stdIn=new Scanner(System.in);
		String S=stdIn.next();
		String T=stdIn.next();
		char s[]=new char[S.length()];
		char t[]=new char[T.length()];
		int slen=S.length(),tlen=T.length();
		int z=0,y=0,x=0,fin=0;
		while(z<slen){
			s[z]=S.charAt(z);
			z++;
		}z=0;y=0;x=0;
		while(z<tlen){
			t[z]=T.charAt(z);
			z++;
		}z=0;y=0;x=0;
		while(z<(slen-tlen)+1){
			while(y<tlen){
				if(s[z+y]!='?'&&s[z+y]!=t[y]){
					fin=1;
					break;
				}
				else
					y++;
			}
			if(fin==0){
				fin=2;
				break;
			}
			fin=0;
			y=0;
			z++;
		}y=0;
		if(fin==2){
			while(x<slen){
				if(x==z)
					while(y<tlen){
						System.out.print(t[y]);
						y++;x++;
					}
				else{
					if(s[x]=='?')
						System.out.print('a');
					else
						System.out.print(s[x]);
					x++;
				}
			}
		}
		else
			System.out.println("UNRESTORABLE");
	}
}
