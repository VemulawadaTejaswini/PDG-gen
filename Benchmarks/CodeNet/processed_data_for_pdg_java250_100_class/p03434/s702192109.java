public class Main {
static long[] list=new long[87];
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
   String nyuA=sc.nextLine();
   String[] s=sc.nextLine().split(" ");
int N=Integer.parseInt(nyuA);
int[] num=new int[N];
for(int i=0;i<N;i++){
num[i]=Integer.parseInt(s[i]);
}
Arrays.sort(num);
int Ali=0;
int Bo=0;
int set=num.length-1;
while(true){
try{
Ali+=num[set];
set--;
Bo+=num[set];
set--;
}catch(Exception e){
break;
}
}
System.out.println(Ali-Bo);
}
}
