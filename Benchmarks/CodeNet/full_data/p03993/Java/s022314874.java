import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();

		String b = scan.nextLine();

		b = scan.nextLine();

		String c[] = b.split(" ");

		int d[] = new int[c.length];

		for(int i=0;i<d.length;i++) {
			d[i] = Integer.parseInt(c[i]);
		}

		/*for (int seiseki: d){
			  System.out.println(seiseki);
		}*/

		int count=0;
		//Arrays.sort(d);
		
		for(int i=0;i<a;i++){
			
			if(d[i] != 0) {
					if(d[i]<d[d[i]-1]) {
						count++;
						d[d[i]-1] = 0;
					}
				}
		}
		System.out.print(count);

	}

}
