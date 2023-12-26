public class Main{
    public static void main(String[] args){
        int n;
        int k;
        int result = 0;
        int temp;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        sc.close();
        temp = n;
        for( int index=1; temp >= k ; index++ ){
            temp = temp / k ;
            result = index;
        }
        result++;
        System.out.println( result );
    }
}
