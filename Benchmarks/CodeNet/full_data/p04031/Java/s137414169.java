import java.util.*;
import java.lang.Math;
public class Main{
public static void main(String[] args){
Scanner x= new Scanner(System.in);

int c= x.nextInt();
int[] arr = new int[c];
double a =0;
for(int i =0;i<c;i++){
	arr[i]=x.nextInt();
	a += arr[i];
}

int a1 = (int)(a/c);
int a2 = a1 +1;


int r1=0;
int r2=0;
for(int i =0;i<c;i++){
	r1 += Math.pow(arr[i]-a1 , 2);
}


for(int i =0;i<c;i++){
	r2 += Math.pow(arr[i]-a2 , 2);
}

System.out.println(Math.min(r1,r2));



}
}
