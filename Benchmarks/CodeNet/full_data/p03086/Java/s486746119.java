import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		String T=stdIn.next();
		int z=0,max=0,cou=0;
		while(z<T.length()){
			if(T.substring(z,z+1).equals("A")){
				cou++;
			}
			else
				if(T.substring(z,z+1).equals("T")){
					cou++;
				}
				else
					if(T.substring(z,z+1).equals("G")){
						cou++;
					}
					else
						if(T.substring(z,z+1).equals("C")){
							cou++;
						}
						else{
							if(max<cou)
								max=cou;
							cou=0;
						}
			z++;
		}
		System.out.println(max);
	}
}