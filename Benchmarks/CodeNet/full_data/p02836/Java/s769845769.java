import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
	String s =  sc.next();
	int count =0;
	int n= s.length();

	for(int i=0;i<n/2;i++) {
		if(s.charAt(i)!=s.charAt(n-1-i)) {
			count += 1;
		}
	}

	System.out.println(count);
  }
}