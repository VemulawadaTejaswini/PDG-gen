public class Main {
    public static void main(String args[]){
        Scanner kb = new Scanner(System.in);
        int yen = kb.nextInt();
        int total = 0;
        total += (yen/500)*1000;
        yen -= (yen/500)*500;
        total += (yen/5)*5;
        System.out.println(total);
    }
}
