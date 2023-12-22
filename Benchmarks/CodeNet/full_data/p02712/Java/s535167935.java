import java.util.*;
public class Main{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long N = n;
    long m = 0 ;
    for(long i=1;i<N+1;i++){
    if ((i%3)==0){}
    else if ((i%5)==0){}
    else{
    m = m+i;
    }
    }
	System.out.println(m);
    }   
}
