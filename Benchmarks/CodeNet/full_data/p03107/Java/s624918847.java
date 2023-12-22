import java.util.Scanner;


public  class Main  {


	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		char Sblock[] = S.toCharArray();
		int intSblock[] = new int[Sblock.length];
		for(int i = 0; i<intSblock.length; i++) {
			 intSblock[i] = Sblock[i] -'0';
		}
		 
		int counter=0;
		int nagasa = S.length();
		while(true) {
			int t1 = 0;
			int t2 = 0;
			for(int i =0; i<S.length()-1; i++) {
				
				boolean flagsuzi = false; //1ならtrue
				if(intSblock[i]==1&&intSblock[i+1]==0) {
					t1 = i;
					t2 = i+1;
					break;
				}
				if( intSblock[i]==0&&intSblock[i+1]==1) {
					t1 = i;
					t2 =i+1;
					break;
				}
				
					
				
			}
			if(t1==0&&t2==0) {
				
				break;
			}
			if(nagasa<0) {
				counter++;
				break;
			}
			String P = "";
			for(int i = 0;i<S.length();i++) {
				if(i==t1||i==t2)continue;
				P = P+intSblock[i];
			}
			char Pblock[] = P.toCharArray();
			int intPblock[] = new int[Pblock.length];
			for(int i = 0; i<intPblock.length; i++) {
				 intPblock[i] = Pblock[i] -'0';
				 
			}
			S = P;
			intSblock = intPblock;
			
			
			counter++;
			nagasa = nagasa -2;
			
		}
		System.out.println(counter*2);
		
		
		
	}}