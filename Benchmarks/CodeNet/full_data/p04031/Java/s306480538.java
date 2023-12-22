import java.util.*;

public class Main{
public static void main(String[] args){
 Scanner scan = new Scanner(System.in);
 int N = scan.nextInt();
 int max=-100;
 int min=100;
 int count = 0;
 int half=0;

 int ar[] = new int[N];

 for(int i=0;i<N;i++){
  ar[i]=scan.nextInt();
 }

 for(int i = 0;i<N;i++){
  if(max<ar[i]) max = ar[i];
  if(min>ar[i]) min = ar[i];
 }
 if(max==min){
   System.out.println(0);
 }else{
   half = (max + min)/2 +1;
   for(int i =0;i<N;i++){
    count += (ar[i]-half)*(ar[i]-half);
   }
   System.out.println(count);
 }
 


}
}

