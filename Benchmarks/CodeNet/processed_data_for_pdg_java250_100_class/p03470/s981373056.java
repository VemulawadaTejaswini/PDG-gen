public class Main {
static long[] list=new long[87];
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
   String nyuA=sc.nextLine();
int N=Integer.parseInt(nyuA);
TreeSet<Integer> list=new TreeSet<>();
for(int i=0;i<N;i++){
list.add(Integer.parseInt(sc.nextLine()));
}
ArrayList<Integer> set=new ArrayList<>(list);
System.out.println(set.size());
}
}
