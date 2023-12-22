import java.util.*;
public class Main{
  
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int N=scanner.nextInt();
    int M=scanner.nextInt();
    int[] A=new int[N];
    int possibleCount=0;
    int tot=0;
    String poss="No";


    for (int i=0;i<N;i++){
        A[i]=scanner.nextInt();
        tot=tot+A[i];
    }
    for (int i=0;i<N;i++){
       possibleCount=(A[i]>=(tot/(4*M)))?possibleCount+1:possibleCount+0;
       if(possibleCount==M ){
           poss="Yes";
           break;
       }
    }
    System.out.println(poss);


  }

}