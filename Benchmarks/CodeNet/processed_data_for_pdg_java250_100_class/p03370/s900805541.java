public class Main {
static long[] list=new long[87];
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
   String[] s=sc.nextLine().split(" ");
int N=Integer.parseInt(s[0]);
int X=Integer.parseInt(s[1]);
TreeSet<Integer> list=new TreeSet<>();
int set=0;
for(int i=0;i<N;i++){
int temp=Integer.parseInt(sc.nextLine());
set+=temp;
list.add(temp);
}
ArrayList<Integer> lists=new ArrayList<>(list);
X-=set;
int res=X/lists.get(0);
res+=N;
System.out.println(res);
}
}
