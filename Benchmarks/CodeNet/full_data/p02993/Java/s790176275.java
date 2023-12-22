import java.util.*;   

public static void Main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int S1 = sc.nextInt();
        String str = String.valueOf(S1);
       String W2="0";
       String W1="0";
        for(int count=1; count<=4;count++){
            
         W1 = str.substring(count-1,count);
        
         
            if(W1 == null ? W2 == null : W1.equals(W2)){
            System.out.print("bad");
            return;
            
        }
        
        W2=W1;
        }
        System.out.print("good");
    }