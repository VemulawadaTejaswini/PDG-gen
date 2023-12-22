public class A {
    public static void main(String[] args) {
        Scanner skan = new Scanner(System.in);
        
        int a = skan.nextInt();
        int b = skan.nextInt();
        
        int wynik = a+b;
        
        if (wynik == 10)
        {
            System.out.println("Error");
        }
        else System.out.println(wynik);
    }
}