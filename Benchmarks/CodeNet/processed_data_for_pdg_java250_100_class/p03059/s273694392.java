public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      String[] nyu=sc.nextLine().split(" ");
int A=Integer.parseInt(nyu[0]);
int B=Integer.parseInt(nyu[1]);
int T=Integer.parseInt(nyu[2]);
int count=0;
int num=0;
int ryo=0;
while(true){
if(count>T)break;
if(count%A==0 && count!=0)ryo+=B;
count++;
}
System.out.println(ryo);
	}
}
