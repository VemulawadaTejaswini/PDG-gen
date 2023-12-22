import java.util.*;
 
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        String str = sc.next();
        
        if(C<D){
            String str1 = str.substring(0,str.length());
            if(D<str.length()){
                str1 = str.substring(A,D+1);
            }else{
                str1 = str.substring(A,D);
            }
            if(str1.contains("##")){
                System.out.println("No");
            }else{
                System.out.println("Yes");
            }
        }else{
            String str1 = str.substring(0,str.length());
            if(C<str.length()){
                str1 = str.substring(A,C+1);
            }else{
                str1 = str.substring(A,C);
            }
            //String str1 = str.substring(A,C);
            String str2 = str.substring(A,C);
            if(B>=2 && D<=N-2){
                str2 = str.substring(B-2,D+2);
            }else if(B>=2 && D>N-2){
                str2 = str.substring(B-2,D+1);
            }else if(B<2 && D<=N-2){
                str2 = str.substring(B-1,D+2);
            }else if(B<2 && D>N-2){
                str2 = str.substring(B-1,D+1);
            }
            
            if(str2.contains("...") && !str1.contains("##")){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
            //System.out.println(str1);
            //System.out.println(str2);
        }
    }
}