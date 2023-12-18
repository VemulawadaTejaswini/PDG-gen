public class Main{
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int a = sc.nextInt();
        final int b = sc.nextInt();
        final int c = sc.nextInt();
        String kc = System.lineSeparator();
        if(a < b){
            if(b < c){
                System.out.printf("%d %d %d"+kc, a, b, c);
            }else{ 
                if(a < c){
                    System.out.printf("%d %d %d"+kc,a, c, b);
                }else{
                    System.out.printf("%d %d %d"+kc,c, a, b);
                }
            }
        }else{
             if(a < c){
                System.out.printf("%d %d %d"+kc,b, a, c );
             }else{
                 if(c > b){
                     System.out.printf("%d %d %d"+kc,b, c, a);
                 }else{
                     System.out.printf("%d %d %d"+kc,c, b, a);
                 }
             }
        }
        sc.close();
    }
}
