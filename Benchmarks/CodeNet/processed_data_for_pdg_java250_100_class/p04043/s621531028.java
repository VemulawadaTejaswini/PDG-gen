public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
     String[] nyu=sc.nextLine().split(" ");
int A=Integer.parseInt(nyu[0]);
int B=Integer.parseInt(nyu[1]);
int C=Integer.parseInt(nyu[2]);
int num[]={A,B,C};
Arrays.sort(num);
if(num[0]==5 && num[1]==5 && num[2]==7){
System.out.println("YES");
}else{
System.out.println("NO");
}
	}
}
