import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);

        String[][] box = new String[3][3];

        for(int i=0; i<3; i++) {
        	String[] line = sc.next().split("");
        	for(int j=0; j<3; j++) {
        		box[i][j] = line[j];
        		if(i==j) {
        			System.out.print(box[i][j]);
        		}
        	}
        }

        sc.close();
    }
}