import java.util.*;
public class Main {
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String s = sc.next();
      int[] x = new int[4];
      for(int i=0;i<4;i++){
        x[i] = Character.getNumericValue(s.charAt(i));
      }     
      for(int i=0;i<Math.pow(2,3);i++){
        char[] op = new char[3];
        for(int j=0;j<3;j++){
          if((i>>j&1)==1){
            op[j]='+';
          }else{
            op[j]='-';
          }
        }
        int sum = x[0];
        for(int k=0;k<3;k++){
          if(op[k]=='+'){
            sum+=x[k+1];
          }else{
            sum-=x[k+1];
          }
        }
        if(sum==7){
          for(int l=0;l<3;l++){
            System.out.print(x[l]);
            System.out.print(op[l]);
          }
          System.out.println(x[3]+"=7");
          break;
        }
      }
      
    }
}