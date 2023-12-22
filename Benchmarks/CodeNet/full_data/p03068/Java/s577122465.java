import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a,b;
    String s;
    a = scanner.nextInt();
    s = scanner.next();
    b = scanner.nextInt();
    char[] charArray = s.toCharArray();
    for(int i=0;i<a;i++){
    	if(charArray[b-1] != charArray[i])
    		charArray[i] = '*';
    	System.out.print(charArray[i]);
    }
  }
}