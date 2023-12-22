import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int D=Integer.parseInt(sc.next());
int N=Integer.parseInt(sc.next());
int count=0,counter=0;
int i=0;
while(true){
i++;
if(i%100==0)count++;
if(i%10000==0)counter++;
switch(D){
        case 0:System.out.println(N);System.exit(0);
        case 1:if(count==N){System.out.println(i);System.exit(0);}
        case 2:if(counter==N){System.out.println(i);System.exit(0);}
}
}

}
}