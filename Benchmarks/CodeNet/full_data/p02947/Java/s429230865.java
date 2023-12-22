    import java.util.Arrays;
    import java.util.HashMap;
    import java.util.Scanner;
    import java.util.Map;
    class Main{
      public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       HashMap<String,Integer> ars = new HashMap<>();
       long a = 0L;
       for(int i = 0; i < n; i++){
         char[] input = sc.next().toCharArray();
         Arrays.sort(input);
         String str = String.valueOf(input);
         int cnt=0;
         if(ars.containsKey(str)){
           cnt = ars.get(str);
           a += cnt;
         } 
         ars.put(str,cnt+1);
       }
       System.out.println(a);
      }
    }