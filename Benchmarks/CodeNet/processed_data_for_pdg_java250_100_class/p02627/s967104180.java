public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        if (a.toUpperCase().equals(a))
            System.out.println("A");
        else
            System.out.println("a");
    }
}
