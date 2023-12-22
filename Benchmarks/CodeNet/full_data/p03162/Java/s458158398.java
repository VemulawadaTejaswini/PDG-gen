import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
		long filas = Integer.parseInt(lector.readLine());
		long[][] matriz = new long[(int) filas][3];
		for (int i = 0; i < matriz.length; i++) {
			String[] datos = lector.readLine().split(" ");
			for (int j = 0; j < matriz[0].length; j++) {
				matriz[i][j] = Integer.parseInt(datos[j]);
			}
		}
		long mayor = 0;
		long actual = 0;
		long posAnterior = 0;
		long posActual = 0;
		long total = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				if (i == 0) {
					actual = matriz[i][j];
					if (actual > mayor) {
						mayor = actual;
						posActual = j;
					}
				} else {
					if(j!=posAnterior) {
						actual=matriz[i][j];
						if(actual>mayor) {
							mayor=actual;
							posActual=j;
						}
					}

				}
			}
			posAnterior=posActual;
			actual=0;
			total+=mayor;
			mayor=0;
		}
		System.out.println(total);
	}
}
