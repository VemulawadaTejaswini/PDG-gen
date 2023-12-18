public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int  min, med, max;
         if( a > b ){
            if( a > c ){
                max = a;
                if( b > c ){
                med = b;
                min = c;
           }else{
                med = c;
                min = b;
            }
           }else{
                med = a;
            if( b > c ){
                max = b;
                min = c;
           }else{
                max = c;
                min = b;
           }
           }
           }else{
            if( b > c ){
                max = b;
            if( a > c ){
                med = a;
                min = c;
           }else{
                med = c;
                min = a;
           }
           }else{
                med = b;
                max = c;
                min = a;
           }
           }
          System.out.println(min + " " + med + " " + max);
}
}
