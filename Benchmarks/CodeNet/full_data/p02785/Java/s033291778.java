import java.util.Scanner;
import java.util.*;

public class Main{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
int k=scan.nextInt();  
int[] h=new int[n];

int i=0;  
for(i=0;i<n;i++){
    h[i]=scan.nextInt();
}
  
Arrays.sort(h);
  
int sum=0;

if(n>k){
    for(i=0;i<n-k;i++){
      sum=sum+h[n-1-i];
    }
System.out.println(sum); 
}else{
  System.out.println("0");
}


}
}
