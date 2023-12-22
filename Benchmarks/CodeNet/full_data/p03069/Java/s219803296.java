import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a;
    String s;
    a = scanner.nextInt();
    s = scanner.next();
    char[] charArray = s.toCharArray();
    int cnt1 = 0;
    int cnt2 = 0;
    if(charArray[0] == '.')
     for(int i=0;i<a&&charArray[i]=='.';i++)
     	cnt2--;
    for(int i=0;i<a;i++){
    	if(charArray[i] != '#')
    		cnt1++;
    	else
    		cnt2++;
    }
    if(cnt1 > cnt2)
      System.out.println(cnt2);
    else
      System.out.println(cnt1);
  }
}
