
import java.util.Scanner;

/**
 *
 * @author alex
 */
public class Main {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String entrada = teclado.nextLine();
        int n = Integer.parseInt(entrada);
        int totalFelicidad =0;
        int aux=0;
        int control = 0;
        String data [] = new String [3];
        entrada = teclado.nextLine();
        data = entrada.split(" ");
        
        aux = Integer.parseInt(data[0]);
        for (int i = 1; i < 3; i++) {
            if (aux<Integer.parseInt(data[i])) {
                aux = Integer.parseInt(data[i]);
                control= i;
            }
        }
        totalFelicidad = totalFelicidad+aux;
        
        for (int i = 1; i < n; i++) {
            entrada = teclado.nextLine();
            data = entrada.split(" ");
            if (control==0) {
                if (Integer.parseInt(data[1])<Integer.parseInt(data[2])) {
                    aux = Integer.parseInt(data[2]);
                    control= 2;
                }else{
                    aux = Integer.parseInt(data[1]);
                    control= 1;
                }
            }else if (control==1) {
                if (Integer.parseInt(data[0])<Integer.parseInt(data[2])) {
                    aux = Integer.parseInt(data[2]);
                    control= 2;
                }else{
                    aux = Integer.parseInt(data[0]);
                    control= 0;
                }
            }else {
                if (Integer.parseInt(data[0])<Integer.parseInt(data[1])) {
                    aux = Integer.parseInt(data[1]);
                    control= 1;
                }else{
                    aux = Integer.parseInt(data[0]);
                    control= 0;
                }
            }
            totalFelicidad = totalFelicidad+aux;
        }
        
        System.out.println(totalFelicidad);
    }
    
    
}