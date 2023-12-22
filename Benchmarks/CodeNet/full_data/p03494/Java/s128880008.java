import java.util.*;

public class Main{
  
  public static void main(String[] args){
    
 	Scanner scanner = new Scanner(System.in);
    ArrayList <Integer> list = new ArrayList <Integer> ();
    
  	int N = scanner.nextInt();
    int count = 0;
    
  	for (int i=0; i<N; i++){
    	int temp = scanner.nextInt();
     	list.add(temp);
  	}
    
    boolean flag = true;
    boolean loopflag = true;
    
    while (loopflag) {
    for (int j=0; j<N; j++){
      int temp = list.get(j);
      
      if (temp%2!=0){
        flag = false;
      }
    }
    
       if (flag == true) {
    	   for (int k=0; k<N; k++){
       
      	  list.set(k, (list.get(k))/2);
       }
       count++;
       } else {
    	   loopflag = false;
       }
    }
    System.out.println(count);
  }
}