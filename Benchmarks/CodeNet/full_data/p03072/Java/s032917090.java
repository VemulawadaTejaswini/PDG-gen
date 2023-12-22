import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        int n = stdIn.nextInt();

        int [] a = new int [n];

        for(int i=0; i<a.length; i++){
            a[i] = stdIn.nextInt();
        }

        int acc = 1;

        Outer:
            for(int i=1; i<a.length; i++){
                for(int j=0; j<i; j++){
                    if(a[i]<a[j]){
                        continue Outer;
                    }
                }
                acc++;
            }

        System.out.println(acc);
    }
}