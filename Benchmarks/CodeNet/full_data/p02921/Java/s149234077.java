import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
	String forecast = sc.nextLine();
	String real = sc.nextLine();
	
	String f[] = forecast.split("");
	String r[] = real.split("");
	
	int cnt = 0;
	for(int i=0; i<3; i++){
		if(f[i].equals(r[i]))
			cnt++;
	}
	
    System.out.println(cnt);
  }
}