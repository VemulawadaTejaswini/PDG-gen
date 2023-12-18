public class Main {
	public static void main(String[] args) {
Scanner kb=new Scanner(System.in);
int a[]={kb.nextInt(),kb.nextInt(),kb.nextInt()};
int num=0;
for(int i=0;i<2;i++){
if(a[0]>a[1]){
	num=a[1];
	a[1]=a[0];
	a[0]=num;
}
if(a[1]>a[2]){
	num=a[2];
	a[2]=a[1];
	a[1]=num;
}
if(a[1]>a[2]){
	num=a[1];
	a[1]=a[2];
	a[2]=num;
}
	}
for(int i=0;i<3;i++){
	System.out.printf("%d", a[i]);
	if(i!=2){
		System.out.print(" ");
	}
}
System.out.println();
	}
}
