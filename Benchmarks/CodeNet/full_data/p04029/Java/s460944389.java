import java.util.*;

class Main {
public static void main(String[] args){

int total;
Scanner sc = Scanner(System.in);
int N  = sc.nextInt();
for(int i = 1, i <= N, i ++){
total += i;
}
System.out.println(total);
}
}