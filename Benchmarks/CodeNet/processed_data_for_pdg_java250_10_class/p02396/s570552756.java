public class Main{
	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		int x[]=new int[20000];
		x[0]=kb.nextInt();
		int h=0;
		int i=0;
		while(x[h]!=0){
			h++;
			x[h]=kb.nextInt();
		}
		while(x[i]!=0){
			System.out.printf("Case %d: %d\n",i+1,x[i]);
			i++;
		}
	}
}
