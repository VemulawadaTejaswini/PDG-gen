public class Main {
	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
long dd[]=new long[10000];
int x=9;
long r = 0;
long su;
for(int i=0;x==9;i++){
su=sc.nextInt();
if(su!=0){
	dd[i]=su;
}
if(su==0){
	r=i;
	break;
}
}
for(int y=0;y<r;y++){
	int l=y+1;
	System.out.println("Case "+ l +": "+dd[y]);
}
	}
}
