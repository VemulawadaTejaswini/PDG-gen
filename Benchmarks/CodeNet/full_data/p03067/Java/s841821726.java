import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if((a<c&&c<b)||(a>c&&c>b))System.out.println("Yes");
        else System.out.println("No");
        
    }
    
 
}class Po{
    int a,b;
    public Po(int a,int b){
        this.a=a;
        this.b=b;
    }
    public String toString(){
        return a+" "+b;
    }
}
