import java.util.*;
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int w = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    
    if(a==b){
        System.out.println("0");    
    }else if(a<b){
    if(b-(a+w)>0){
        System.out.println(b-(a+w));
    }else{
        System.out.println("0");
}
    }else{
    if(a-(b+w)>0){
        System.out.println(a-(b+w));
    }else{
        System.out.println("0");
    }    
    }
}
}