public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String card = sc.next(); 
            if (card.equals("-")) break;
            int s = sc.nextInt(); 
            int n = 0;
            for (int i=0; i<s; i++) {
                n += sc.nextInt();
            }
            for (int i=0; i<card.length(); i++) {
                System.out.print(card.charAt((n+i)%card.length()));
            }
            System.out.println("");
        }
    }
}
