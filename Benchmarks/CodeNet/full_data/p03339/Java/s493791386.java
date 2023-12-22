import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next();

        int min=0;
        int current=0;
        //i=0
        for (char c: s.substring(1).toCharArray()){
            if (c=='E'){current++;}
            min = current;
        }
        //i>=1
        for (int i=1; i<n; i++){
            if (s.charAt(i-1)=='W'){current++;}
            if (s.charAt(i)=='E'){current--;}
            min = Math.min(min, current);
        }
        System.out.println(min);
    }
}