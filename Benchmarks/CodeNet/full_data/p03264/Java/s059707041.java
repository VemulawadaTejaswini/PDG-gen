import java.util.*;
class Main{
  public static void main(String[] args){
  Scanner stdIn=new Scanner(System.in);
    int K =stdIn.nextInt();
    if(K%2==0){
		System.out.println(K/2*K/2);
    }else{
      	int n=K/2+1;
		System.out.println(n*(K/2));
    }
  }
}