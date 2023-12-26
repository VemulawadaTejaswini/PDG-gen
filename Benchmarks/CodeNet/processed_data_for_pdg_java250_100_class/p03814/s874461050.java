public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      String[] S=sc.nextLine().split("");
for(int i=0;i<S.length;i++){
if(S[i].equals("A"))break;
S[i]="0";
}
for(int i=S.length-1;i>0;i--){
if(S[i].equals("Z"))break;
S[i]="0";
}
int count=0;
for(int i=0;i<S.length;i++){
if(S[i].equals("0")){
}else{
count++;
}
}
System.out.println(count);
	}
}
