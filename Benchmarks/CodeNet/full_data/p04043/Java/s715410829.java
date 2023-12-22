import java.util.*;

public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    
    int g = 0;
    int na = 0;
    if(A==5){
        g++;
    }else if(A==7){
        na++;
}
    if(B==5){
        g++;
    }else if(B==7){
        na++;
}
    if(C==5){
        g++;
    }else if(C==7){
        na++;    
    }
    
    if(g==2 && na==1){
    System.out.println("YES");
    }else{
    System.out.println("NO");    
    }
}
    }