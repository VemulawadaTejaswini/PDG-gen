public class Main {
    public static void main(String[] args) {
        Long n;
        HashSet<String> sName = new HashSet<String>();  
        Scanner sc = new Scanner(System.in);
        n = sc.nextLong();
        for(int i = 0; i < n; i++){
            sName.add(sc.next());
        }
        System.out.println(sName.size());
    }
}
