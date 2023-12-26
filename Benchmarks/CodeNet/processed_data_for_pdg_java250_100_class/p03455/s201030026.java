public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
     String[] nyu=sc.nextLine().split(" ");
int A=Integer.parseInt(nyu[0]);
int B=Integer.parseInt(nyu[1]);
int res=A*B;
if(res%2==0){
System.out.println("Even");
}else{
System.out.println("Odd");
}
	}
}
