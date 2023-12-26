public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
     String[] nyu=sc.nextLine().split("");
int res=0;
for(String tem:nyu){
if(tem.equals("1"))res++;
}
System.out.println(res);
	}
}
