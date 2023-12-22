import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
      	int count = 0;
      	for(int i = 0 ; i < 3 ; i++){
         if(a.substring(i,i+1).equals("1")){
  			count ++ ;       
         }
        }          
            System.out.print(count);
    }
}

