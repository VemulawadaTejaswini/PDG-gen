public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      String[] nyu=sc.nextLine().split(" ");
int num=Integer.parseInt(nyu[0]);
int numnext=Integer.parseInt(nyu[1]);
int[] data=new int[3];
data[0]=num+numnext;
data[1]=num * numnext;
data[2]=num - numnext;
Arrays.sort(data);
int count=0;
System.out.println(data[2]);
	}
}
