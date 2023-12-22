import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		final int n = Integer.parseInt(sc.nextLine());
		long cntM=0;
		long cntA=0;
		long cntR=0;
		long cntC=0;
		long cntH=0;
		for(int i=0;i<n;i++){
			String[] name = sc.nextLine().split("");
			if(name[0].equals("M")){
				cntM=cntM+1;
			}else if(name[0].equals("A")){
				cntA=cntA+1;
			}else if(name[0].equals("R")){
				cntR=cntR+1;
			}else if(name[0].equals("C")){
				cntC=cntC+1;
			}else if(name[0].equals("H")){
				cntH=cntH+1;
			}
		}
		long answer=cntM*cntA*cntR+cntM*cntA*cntC+cntM*cntA*cntH+
					cntM*cntR*cntC+cntM*cntR*cntH+
					cntM*cntC*cntH+
					cntA*cntR*cntC+cntA*cntR*cntH+
					cntA*cntC*cntH+
					cntR*cntC*cntH;
		System.out.println(answer);
	}
}