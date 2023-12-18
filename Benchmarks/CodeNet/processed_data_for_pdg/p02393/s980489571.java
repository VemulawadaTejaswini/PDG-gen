public class Main {
	public static void main(String[] args) {
		int i1, i2, i3, temp;
		Scanner sc = new Scanner(System.in);
		i1 = sc.nextInt();
		i2 = sc.nextInt();
		i3 = sc.nextInt();
		if(i1 > i2){
			temp = i1;
			i1 = i2;
			i2 = temp;
		}
		if(i1 > i3){
			temp = i1;
			i1 = i3;
			i3 = temp;
		}
		if(i2 > i3){
			temp = i2;
			i2 = i3;
			i3 = temp;
		}
		System.out.println(i1 + " " + i2 + " " + i3);
	}
}
