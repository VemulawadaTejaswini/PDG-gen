import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
		
    String S = sc.next();
    String li[] = S.split("");
    
    int i = 0;
    int count = 0;
    int N = li.length;
    while(i<N-i){
      if(!li[i].equals(li[N-1-i])){
        count++;
      }
      i++;
    }
    System.out.println(count);
  }
}