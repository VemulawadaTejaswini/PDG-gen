import java.io.*;
import java.util.*;
import java.lang.*;

class Output extends PrintWriter {

    public Output(PrintStream io) {
        super(io);
    }

    public void printArray(int[] array, String space, String end) {
        int N = array.length;
        for(int n=0; n<N-1; n++){
            super.print(array[n]);
            super.print(space);
        }
        super.print(array[N-1]);
        super.print(end);
        super.flush();
    }
    public void printArray(int[] array){
        this.printArray(array, " ", "\n");
    }
    public void printArray(long[] array, String space, String end) {
        int N = array.length;
        for(int n=0; n<N-1; n++){
            super.print(array[n]);
            super.print(space);
        }
        super.print(array[N-1]);
        super.print(end);
        super.flush();
    }
    public void printArray(long[] array){
        this.printArray(array, " ", "\n");
    }
    public void printArray(double[] array, String space, String end) {
        int N = array.length;
        for(int n=0; n<N-1; n++){
            super.print(array[n]);
            super.print(space);
        }
        super.print(array[N-1]);
        super.print(end);
        super.flush();
    }
    public void printArray(double[] array){
        this.printArray(array, " ", "\n");
    }
    public void printArray(char[] array, String space, String end) {
        int N = array.length;
        for(int n=0; n<N-1; n++){
            super.print(array[n]);
            super.print(space);
        }
        super.print(array[N-1]);
        super.print(end);
        super.flush();
    }
    public void printArray(char[] array){
        this.printArray(array, " ", "\n");
    }
    public void printArray(Object[] array, String space, String end) {
        int N = array.length;
        for(int n=0; n<N-1; n++){
            super.print(array[n]);
            super.print(space);
        }
        super.print(array[N-1]);
        super.print(end);
        super.flush();
    }
    public void printArray(Object[] array){
        this.printArray(array, " ", "\n");
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Output out = new Output(System.out);

        String forecast = sc.next();
        String weather = sc.next();
        int match = 0;
        for(int d=0; d<3; d++) if(forecast.charAt(d)==weather.charAt(d)) match++;
        out.println(match);


        out.flush();
    }
}
