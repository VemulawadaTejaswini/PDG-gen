import java.util.Scanner;
public class Main{
	public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
      int N = scn.nextInt();
      scn.close();
      int s;
      for(int i = 0; i<3 ; i++){
      if(N.charAt(i) == 7){
      s +=1;
      }
      }
  	if(s>0){
    System.out.println("Yes");
    }else{
    System.out.println("No");
    }
    }
}