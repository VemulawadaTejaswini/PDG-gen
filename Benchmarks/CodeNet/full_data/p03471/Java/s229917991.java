import java.util.Scanner;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int Y = sc.nextInt();
	
	int tmpMoney = 0;
	boolean isTruth = false;
	
	for (int a=0; a<N; a++){
	  for (int b=0; b<N-a; b++){
	    int c = N - a - b;
	    tmpMoney = 10000*a + 5000*b + 1000*c;
	    if(tmpMoney == Y){
	      System.out.println(a + " " + b + " " + c);
	      isTruth = true;
	      break;
	    }
	  }
      if(isTruth)
        break;
	}
	
	if(!isTruth)
	  System.out.println("-1 -1 -1");
  }
}