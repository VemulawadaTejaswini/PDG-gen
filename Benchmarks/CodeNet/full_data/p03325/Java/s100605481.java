

import java.util.Scanner;

class DoisOrTres {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		sc.nextLine();
		int[] vet = new int[a];

		int b = 0;
		for (int i = 0; i < a; i++) {
			b = sc.nextInt();
			vet[i] = b;
		}

		int conte = 0;
		while(true) {
			boolean entrou = false;
			for(int i = 0; i<a; i++) {
				if(!entrou && vet[i] % 2 == 0) {
					entrou = true;
					vet[i] = vet[i]/2;
					conte += 1;	
				}else {
					vet[i] = vet[i]*3;
				}
			}
			if(!entrou) {
				System.out.println(conte);
				break;
			}
			
		}
		
	}

}