import java.util.Scanner;
public class Main {

		public static void main(String[] args) {
			Scanner teclado = new Scanner (System.in);
			int trem = teclado.nextInt();
			int taxi = teclado.nextInt();
			int minimo= teclado.nextInt();
			
			int cal= trem*taxi;
			
			if (trem*taxi<minimo) {
				System.out.println(trem*taxi);
			} else {
				System.out.println(minimo);
						
					}
			
}
}