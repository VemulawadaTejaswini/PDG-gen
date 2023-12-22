import java.util.*;
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String[]S = new String[N];
    ArrayList<String>hina = new ArrayList<>();
    
    for(int i=0; i<N-1; i++){
       S[i] = sc.next();
    if(!hina.contains(S[i])){
        hina.add(S[i]);
   } 
}
    if(hina.size()==4){
        System.out.println("Four");
    }else{
        System.out.println("Three");
    }
}
}