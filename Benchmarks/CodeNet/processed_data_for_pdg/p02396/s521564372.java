public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<Integer>();
        int temp;
        while(true){
            temp = sc.nextInt();
            a.add(temp);
            if(temp == 0) break;
        }
        for(int i = 0; i < a.size() - 1; i++){
            System.out.println("Case " + (i+1) + ": " + a.get(i));
        }
        sc.close();
    }
}
