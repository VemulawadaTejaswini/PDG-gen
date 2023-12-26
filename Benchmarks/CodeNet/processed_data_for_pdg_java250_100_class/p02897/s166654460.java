public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble(); 
        sc.close();
        if(n%2 == 0){
            System.out.println(0.5000000000);
        }else{
            System.out.println(((n+1)/2)/n);
        }
    }
}
