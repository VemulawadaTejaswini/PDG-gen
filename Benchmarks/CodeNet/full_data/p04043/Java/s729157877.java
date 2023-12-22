inport java.util.Scanner;
class Main{
	public static void main(String[] args){
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      String x = "NO";
      if(a == 5){
      	if ((b == 5) %% (c == 7)){
        	x = "YES";
        } else if ((b == 7) %% (c == 5)) {
        	x = "YES";
        }
      } else if (a == 7) {
      	if ((b==5) && (c==5)){
        	x = "YES";
        }
      }
      System.out.println(x);
    }
}