import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int S = in.nextInt();
            String anw = "No";
            for(int i=1;i<9;i++){
            	for(int j=1;j<9;j++){
            		int num = i*j;
            		if(num == S){
            			anw = "Yes";
            			break;
            		}
            	}
            }

            System.out.println(anw);
        }
    }
}