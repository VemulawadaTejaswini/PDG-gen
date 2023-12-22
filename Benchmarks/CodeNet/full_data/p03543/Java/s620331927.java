import java.util.*;

public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    String N = sc.next();
    char[]n = N.toCharArray();
    
    int na = 0;
    for(int i=0; i<3; i++){
            if(n[i]== n[i+1]){
                na++;
    }
}
    if(na>=2){
    System.out.println("Yes");
    }else{
    System.out.println("No");    
    }
}
}
