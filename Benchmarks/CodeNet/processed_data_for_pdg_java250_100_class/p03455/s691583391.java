public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int anser = a*b;
        String ans="";
        if (anser%2==0){
          ans="Even";
        }else{
            ans="Odd";
        }
        System.out.println(ans);
    }
}
