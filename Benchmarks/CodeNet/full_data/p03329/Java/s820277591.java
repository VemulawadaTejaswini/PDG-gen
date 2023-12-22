import  java.util.*;
class Main{

public static void main(String[] args){

Scanner s = new Scanner(System.in);
int[] arr = {1,6,9,36,81,216,729,1296,6561,7776,59049};

int n = s.nextInt() , opera = 0;

for(int i = arr.length-1;i >= 0;i--){
opera += (n/arr[i]);
n = n % arr[i];
}

System.out.println(opera);
}
}