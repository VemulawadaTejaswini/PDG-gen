class Main
{
public static void main(String[] args)
{
	Scanner scan = new Scanner(System.in);
	int[] x = new int[10002];
	int i;
	int a;
	for (i=0; i<10002; i++){
		x[i] = 0;}
	for (i=1; i<10002; i++){
		x[i] = scan.nextInt();
		if (x[i]==0){
			break;}}
	for (int q=1; q<i; q++){
		System.out.println("Case "+q+": "+x[q]);}
	}
}
