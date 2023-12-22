import java.util.Scanner;

public class Main{
public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
int A1 = sc.nextInt();
int A2 = sc.nextInt();
if(A1>A2){
    int temp=A1;
    A1=A2;
    A2=temp;
}

int A3 = sc.nextInt();
if(A2>A3){
    int temp=A2;
    A2=A3;
    A3=temp;
}

System.out.println(A1*A2/2);
}
}
