import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int D=Integer.parseInt(sc.next());
int N=Integer.parseInt(sc.next());
int k;
switch(D){
    case 0:System.out.println(N);
            break;
    case 1:k=100;
    int l=k*N;
            if(l%10000==0){System.out.println(k*(N+1));}else{System.out.println(k*N);}
            break;
    case 2:k=10000;
    int m=k*N;
           if(m%1000000==0){System.out.println(k*(N+1));}else{System.out.println(k*N);}
            break;
}

}
}