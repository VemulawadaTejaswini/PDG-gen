import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		for (int i=0;i*100<=X;i++) {
			for (int i1=0;i1*101<=X;i1++) {
				for (int i2=0;i2*102<=X;i2++) {
					for (int i3=0;i3*103<=X;i3++) {
						for (int i4=0;i4*104<=X;i4++) {
							for (int i5=0;i5*105<=X;i5++) {
								if (i*100+i1*101+i2*102+i3*103+i4*104+i5*105==X) {
									System.out.println(1);
									return;
								}
							}
						}
					}
				}
			}
		}
		System.out.println(0);
		return;
	}
}