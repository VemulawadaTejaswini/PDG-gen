public class Main {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int n[]=new int[3];
		for(int i=0;i<3;i++){
			n[i]=scan.nextInt();
		}
		scan.close();
		int index,tmp;
		for(int i=0;i<2;i++){
			index=i;
			for(int j=i+1;j<3;j++){
				if(n[j]<n[index]) index=j;
			}
			tmp=n[i];
			n[i]=n[index];
			n[index]=tmp;
		}
		for(int i=0;i<3;i++){
			if(i==0) System.out.print(n[i]);
			else System.out.print(" "+n[i]);
		}
		System.out.println();
	}
}
