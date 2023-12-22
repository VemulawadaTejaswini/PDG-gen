
import java.util.Scanner;
public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		int N = Integer.parseInt(n);
		String a = new Scanner(System.in).nextLine();
      	int p = 0;
        String[] b = a.split(" ");
      	for (int j=0;j<N-1;j++){
      		if(Integer.parseInt(b[j])==Integer.parseInt(b[j+1])){
      				p++;
      				b[j+1] = "100";
      		}
      	}
      	System.out.println(p);
    }
}