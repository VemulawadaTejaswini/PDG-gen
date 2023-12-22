public class Main {
	public static void main(String args[]){

		Scanner scan=new Scanner(System.in);

		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		int x=scan.nextInt();
		int y=scan.nextInt();

		int count[]=new int[3];

		if(c*2>(a+b)) {
			count[0]=x;
			count[1]=y;
			count[2]=0;
		}else if(Math.min(a, b)>c*2){
			count[0]=0;
			count[1]=0;
			count[2]=Math.max(x, y)*2;
		}else if(x>y){
			count[0]=x-y;
			count[1]=0;
			count[2]=y*2;
		}else {
			count[0]=0;
			count[1]=y-x;
			count[2]=x*2;
		}

		System.out.println((a*count[0])+(b*count[1])+(c*count[2]));
	}
}