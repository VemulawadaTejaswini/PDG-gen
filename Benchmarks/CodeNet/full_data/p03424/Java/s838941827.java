import java.util.*;
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String[]S= new String[N];
    ArrayList<String>c = new ArrayList<>();

    for(int i=0; i<N; i++){
    S[i] = sc.next();
    if(!c.contains(S[i])){
        c.add(S[i]);
    }
}
    if(c.size()==3){
		System.out.println("Three");
	}else{
        System.out.println("Four");
	}
}
}
