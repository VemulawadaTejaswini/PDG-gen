import java.util.Scanner;

public class Main {

    public void main(String[] args) {

       Scanner scanner = new Scanner(System.in);
       String A = scanner.next();
       int ans = 0;

       for(int i = 1; i < 4; i++) {

       		if(A.substring(i,i+1).equals("+")) {
       			ans++;
       		}else {
       			ans--;
       		}
       }
       System.out.println(ans);

    }
