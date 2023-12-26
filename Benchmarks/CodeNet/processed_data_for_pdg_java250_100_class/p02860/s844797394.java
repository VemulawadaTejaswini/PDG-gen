public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        if(n%2!=0){
            System.out.print("No");
            return;
        }
        int i = 0;
        while(i < n/2){
            if(str.charAt(i)!=str.charAt(i+n/2)){
                System.out.print("No");
                return;
            }
            i++;
        }
        System.out.print("Yes");
    }
}
