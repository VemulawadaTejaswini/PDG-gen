public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> x = new ArrayList<>();
        while(true) {
            x.add(sc.nextInt());
            if(x.contains(0)) {
                break;
            }
        }
        sc.close();
        for(int i=0; i<x.size()-1; i++) {
            int c = i+1;
            System.out.println("Case " + c + ": " + x.get(i));
        }
    }
}
