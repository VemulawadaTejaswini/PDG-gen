import java.util.*;

public class Main{
  public static void main(String[]args){

    Scanner sc=new Scanner(System.in);
    int A=sc.nextInt();
    int B=sc.nextInt();

    for(int i=1;i<10000;i++){
for(int j=1;j<10000;j++){
  if(A*i==B*j){
System.out.println(A*i);
    break;
  }
}
    }
  }
}

                  
