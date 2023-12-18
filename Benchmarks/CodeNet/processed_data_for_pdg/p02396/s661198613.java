public class Main{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		int i=1;
		while(true){
			int x=stdIn.nextInt();
			if(x==0){
				break;
			}
			System.out.println("Case "+i+": "+x);
			i++;
		}
	}
}
