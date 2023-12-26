public class Main {
	public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        int a, b,c,d;
        a = sc.nextInt(); 
        b = sc.nextInt(); 
        c = sc.nextInt(); 
        d = sc.nextInt(); 
        for(int i=0;;i++){
            if(i%2==0){
                c=c-b;
                if(c<=0){
                    System.out.println("Yes");
                    break;
                }
            }else{
                a=a-d;
                if(a<=0){
                    System.out.println("No");
                    break;
                }
            }
        }
    }
}
