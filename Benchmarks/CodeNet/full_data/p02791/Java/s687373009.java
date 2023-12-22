import java.util.Scanner;
public class Main{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] P = new int[N];
    int count = 0;
    for(int i =0; i<N; i++){
      	P[i] = sc.nextInt();
    }
    
    for(int i = 0; i<N; i++){
    	int searchNumber = P[i];
        boolean hantei = true;
        for(j = 0; j<i; j++){
          if(searchNumber > P[j])
            hantei = false;
            break;
        }
        if (hantei == true)
             count++;
    } 
    System.out.println(count);
  }
}