import java.util.*;
public class Main{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long m = 0 ;
    for(long i = 0;i<N;i++){
    if ((i%3)==0){}
    else if ((i%5)==0){}
    else{
    m = m+i;
    }
    }
	System.out.println(m);
    }   
}