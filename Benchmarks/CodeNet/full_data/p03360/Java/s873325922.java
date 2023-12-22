import java.util.*;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int k = sc.nextInt();
   int max =a;
   int cd =0;
if(max<=b){
max =b;
cd =1;
}
if(max<=c){
max =c;
cd =2;
}
for(int i=0;i<k;i++){
 max = max *2;
}
if(cd =0){
max =max +b+c;
}else if(cd =1){
max =max +a+c;
}else{
max = max+b+c;
}

 System.out.println(max);
 }
}
