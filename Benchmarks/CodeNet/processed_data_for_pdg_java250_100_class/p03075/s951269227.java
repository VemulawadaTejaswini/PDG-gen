public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n[]=new int[5];
		String s="Yay!";
		for(int i=0;i<=4;i++){
		n[i]= sc.nextInt();
		}
		int k=sc.nextInt();
		for(int i=0;i<=4;i++){
for(int j=0;j<=4;j++){
	if(Math.abs(n[i]-n[j])>k){
		s=":(";
	}
}
		}
System.out.println(s);
	}}
