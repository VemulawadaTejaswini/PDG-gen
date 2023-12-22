import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char[] c = sc.next().toCharArray();
        int min = a;
        for(int i=0; i< a; i++) {
            int count =0;
            for(int j=0; j<i; j++) {
                if(c[j] == 'W') {
                    count++;
                }
            }
            for(int k=i+1; k<a; k++) {
                if(c[k] == 'E') {
                    count++;
                }
            }
            if(min > count) {
                min = count;
            }
        }
        System.out.println(min);
    }
}