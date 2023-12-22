import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int N;
	static int M;
	static int[] Pcity;
	static int[] Ycity;
	static String[] PYcity;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		Pcity = new int[M];
		Ycity = new int[M];
		PYcity =  new String[M];
		for(int i=0;i<M;i++){
			Pcity[i] = sc.nextInt();
			Ycity[i] = sc.nextInt();
			PYcity[i] = String.valueOf(Pcity[i])+"-"+String.valueOf(Ycity[i]);
		}
		
		Arrays.sort(PYcity);
	
		int Ynum = 0;
		for (int i=0;i<M;i++) {
			for(int r=0;r<M;r++){
				String [] PY = PYcity[r].split("-");
				if(String.valueOf(Pcity[i]).equals(PY[0])){
					Ynum++;
					if(String.valueOf(Ycity[i]).equals(PY[1])){
						break;
					}
				}
			}
			System.out.println(mendPosition(Pcity[i])+mendPosition(Ynum));
			Ynum = 0;
        }
		
		sc.close();
	}
    
    private static String mendPosition(int num){
    	String numTemp = String.valueOf(num);
    	String strnum = "";
    	for(int i=0;i<6-numTemp.length();i++){
    		strnum += "0";
    	}
    	strnum = strnum+numTemp;
    	return strnum;
    } 
    
}


	

