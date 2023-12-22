import java.util.Scanner;
class Main{
	
	public static void main(String[] args) {
		Scanner Cf=new Scanner(System.in);
		int Sv=Cf.nextInt();
		int[] Array=new int[Sv];
		for(int i=0;i<Array.length;i++) {
			Array[i]=Cf.nextInt();
		}
		
		int answer=Sendit(Array);
		System.out.println(answer);
	}
	public static int Sendit(int[] Array) {
		int counter=0;
		//3,1,3,2,3,1
		for(int i=0;i<Array.length-2;i++) {
			if(!(Array[i]==Array[i+2]) ||  (Array[i]==Array[i+1])) {
				counter++;
			}
		}
		return counter;
	}

}
