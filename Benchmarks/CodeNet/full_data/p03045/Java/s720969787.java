import java.util.Scanner;

public class Main {

    static Scanner stdIn = new Scanner(System.in);
    public static void main(String[] args) {
        int n = stdIn.nextInt();
        int m = stdIn.nextInt();

        int[] array = new int [n];
        for(int i=0; i<array.length; i++){
            array[i] = 0;
        }

        int[][] equation = new int [m][3];
        for(int i=0; i<equation.length; i++){
            equation[i][0] = stdIn.nextInt();
            equation[i][1] = stdIn.nextInt();
            equation[i][2] = stdIn.nextInt();
        }

        int ketugousuu = 0;
        int counter = 1;


        for(int i=0; i<equation.length; i++){
            if(array[equation[i][0]-1] == 0 && array[equation[i][1]-1] == 0){
                array[equation[i][0]-1] = counter;
                array[equation[i][1]-1] = counter;
                counter++;
            }else if(array[equation[i][0]-1] == 0 && !(array[equation[i][1]-1] == 0)){
                array[equation[i][0]-1] = array[equation[i][1]-1];
            }else if(!(array[equation[i][0]-1] == 0) && array[equation[i][1]-1] == 0){
                array[equation[i][1]-1] = array[equation[i][0]-1];
            }else{
                ketugousuu++;
            }
        }


        int zeronokazu = 0;
        for(int i=0; i<array.length; i++){
            if(array[i] == 0){
                zeronokazu++;
            }
        }

        System.out.println(counter+zeronokazu-ketugousuu-1);

    }
}