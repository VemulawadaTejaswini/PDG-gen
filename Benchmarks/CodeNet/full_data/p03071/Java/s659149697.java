import java.util.*;

 
class Main {
 
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

    int a = Integer.parseInt(sc.next());
    int b = Integer.parseInt(sc.next());
    int ans=0;
    for(int i=0;i<2;i++){
        if(a>b){
            ans+=a;
            a=a-1;
        }else{
            ans+=b;
            b=b-1;
        } 
    }
    System.out.println(ans);

}
}