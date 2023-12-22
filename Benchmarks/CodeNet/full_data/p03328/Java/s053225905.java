import  java.util.*;
class Main{

public static void  main(String[]  args){

 long sum = 1;int[] arr = new int[1000];
for(int i = 1;i <= 999 ;i++)
arr[i] = i+arr[i-1];

Scanner  s = new Scanner(System.in);
int a = s.nextInt() , b = s.nextInt();

int diff = 0;
for(int i = 1;i <= 999;i++){
if(arr[i] >= a){
diff = (arr[i] - a);
break;
}
}
System.out.println(diff);
}
}