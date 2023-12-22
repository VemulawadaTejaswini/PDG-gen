import java.util.Scanner;

public class Solution{
     public static void main(String[] args){
          Scanner in = new Scanner(System.in);
         int n = in.nextInt();
         int k = in.nextInt();
        int x = in.nextInt();
        int y = in.nextInt();
       
      int ret = 0;
   for(int i = 0; i<n ; i++){
    if(k<n){
    ret = ret+x;
}else{
    ret = ret+y;
}

}
System.out.println(ret);
}
}