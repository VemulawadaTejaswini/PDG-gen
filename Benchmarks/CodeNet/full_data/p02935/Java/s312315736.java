import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        int num = Integer.valueOf(line).intValue();
        line = sc.nextLine();
        String[] input = line.split(" ", 0);
        double list[] = new double[num];

        int i = 0;
        while(i != num){
            list[i] = Double.parseDouble(input[i]);
            i++;
        }

        i = 0;
        double db = 0.0;
        while(i != num-1){
            sort(list);
            db = (list[i]+list[i+1])/2.0;
            list[i] = 0;
            list[i+1] = db;

            i++;
        }
        System.out.println(db);

    }

    public static void sort( double[] array ) {
        double tmp;
        for( int i=0; i<array.length-1; i++ ) {
            for( int j=0; j<array.length-i-1; j++ ) {
                if( array[j] > array[j+1] ) {
                    tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
    }
}