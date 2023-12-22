import java.util.*;
public class Main{
	
	public static void main(String[] args){
		
		Scanner sn = new Scanner(System.in);
		int i = 0;
		int N = 0;
		int D = 0;
        String str = sn.nextLine();
		try{
			String[] strlist = str.split(" ",0);
			N = Integer.parseInt(strlist[0]);
			if(N<1 || N > 20){
				System.out.println("error1");
				return;
			}
			D= Integer.parseInt(strlist[1]);
			if(D<1 || D>20){
				System.out.println("error2");
				return;
			}
		}catch(Exception e){
			System.out.println("error3");
			return;
		}
		sn.close();
		if(N%(2*D+1)==0){
			System.out.println(N/(2*D+1) );
		}else{
			System.out.println(N/(2*D+1) + 1);
		}
	}
}