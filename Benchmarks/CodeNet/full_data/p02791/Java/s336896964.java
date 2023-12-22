import java.util.*;
 
class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
      int[] b = new int[a];
      int f = 0;
      int c=1;
      
      for(int i=0;i<a;i++){
               b[i] = sc.nextInt();
              }
      if(a==1){
        System.out.println(1);
      }else{
      for(int j=1;j<a;j++){
        for(int k=0;k<=j;k++){
        
          if(b[j]<=b[k]){
            f = 1;
          } else {
            f=0;
            break;
          }
        }
        if(f==1){
          c++;
        }
          
      
      }
      System.out.println(c);
      }
 
 
		sc.close();
	}
}