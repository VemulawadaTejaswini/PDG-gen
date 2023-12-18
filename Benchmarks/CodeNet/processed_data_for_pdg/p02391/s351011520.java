public class Main{
	public static void main(String[] args){
	int a,b;
	Scanner br=new Scanner(System.in);
	a=br.nextInt();
	b=br.nextInt();
	if(a>b){
		System.out.println("a > b");
	}else if(a<b){
		System.out.println("a < b");
	}else{
		System.out.println("a == b");
	}
	}
}
