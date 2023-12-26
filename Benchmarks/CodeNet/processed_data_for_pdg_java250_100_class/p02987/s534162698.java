public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      String[] nyu=sc.nextLine().split("");
HashSet<String> list=new HashSet<>();
for(String temp:nyu)
list.add(temp);
if(list.size()!=2){
System.out.println("No");
}else{
int count=0;
for(int i=0;i<4;i++){
if(nyu[0].equals(nyu[i]))count++;
}
if(count==2){
System.out.println("Yes");
}else{
System.out.println("No");
}
}
	}
}
