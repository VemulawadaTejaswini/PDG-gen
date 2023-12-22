import java.util*;

public class Main{
  public static void main(String[] args){
   Scaneer sc = new Scanner(Syst0em.in);
    int n = sc.nextInt();
    int x = sc.nextInt();
    
    int[] l = new int[n];
    int bound = 0;
    int count = 1;
    
    for(int i =0,int i < n,i++){
      bound += sc.nextInt();
      count++;
      if(bound < x){
        break;
     }    
    }
    System.out.printlm(count);
  }
 }