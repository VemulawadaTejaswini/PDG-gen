import java.util.Scanner;
class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int p=(int)Math.pow(10, 8);
		int[] d=new int[p+1];
		int[] dd=new int[n];
		int ddite=0;//dd要素数
		for(int i=0;i<n;i++){
			int buf=sc.nextInt();
			if(buf<=p){
				d[buf]++;
			}
			else{
				dd[ddite]=buf;
				ddite++;
			}
		}
		int m=sc.nextInt();
		int[] t=new int[m];
		for(int i=0;i<m;i++){
			t[i]=sc.nextInt();
		}
		boolean is=true;
		if(n<m){
			is=false;
		}

		for(int i=0;is&&i<m;i++){
			if(t[i]<=p){
				if(d[t[i]]<=0){
					is=false;
					break;
				}
				d[t[i]]--;
			}
			else{
				for(int j=0;j<ddite;j++){
					if(dd[j]==t[i]){
						dd[j]=-1;
						break;
					}
					if(j==ddite){
						is=false;
					}
				}
			}

		}


		if(is){
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}
	}
}