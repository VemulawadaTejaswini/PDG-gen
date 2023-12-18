public class Main {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int[] a = new int [3];
	for(int i = 0; i < a.length; i++){
	a[i] = sc.nextInt();
	}
for(int i = 0; i < a.length; i++) {
	for(int j = i + 1; j < a.length; j++) {
		if(a [i] > a [j]) {
			int temp;
			temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}
	}
}
for (int i = 0; i < 3; i++)
{
    if (i == 0)
        System.out.print(a[i]);
    else if(i==1)
        System.out.printf(" %d", a[i]);
    else if(i==2)
        System.out.println(" "+a[i]);
}
}
}
