import  java.util.*;
class Main{

public static void  main(String[]  args){

 long sum = 1;int[] arr = new int[1000];
for(int i = 1;i <= 999 ;i++)
arr[i] = i+arr[i-1];

Scanner  s = new Scanner(System.in);
int a = s.nextInt() , b = s.nextInt();

int diff1 = 0 , diff2 = 0;
for(int i = 1;i <= 999;i++){
if(arr[i] >= a){
diff1 = (arr[i] - a);
diff2 = (arr[i+1] - b);
if(diff1 == diff2)
break;
}
}
System.out.println(diff);
}
}