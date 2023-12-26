public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      String[] nyu=sc.nextLine().split("");
      String[] nyureal=sc.nextLine().split("");
int count=0;
for(int i=0;i<nyu.length;i++){
if(nyu[i].equals(nyureal[i])){
count++;
}
}
System.out.println(count);
	}
}
