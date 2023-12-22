import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int Q=sc.nextInt();
		String s=sc.next();
		int[][] v=new int[Q][2];
		for(int i=0;i<Q;i++){
			v[i][0]=sc.nextInt();
			v[i][1]=sc.nextInt();
		}
		sc.close();
		for(int i=0;i<Q;i++){
			String ss=s.substring(v[i][0]-1,v[i][1]);
			System.out.println(proc(ss));
		}
	}

	private static int proc(String str){
		char[] ch=str.toCharArray();
		int counter=0;
		for(int i=1;i<ch.length;i++){
			if(ch[i-1]=='A'&&ch[i]=='C')counter++;
		}
		return counter;
	}
}