public class Main {
    private static final boolean IS_TAKAHASHI_TURN = true;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long giftCount = sc.nextLong();
        Set<String> giftList = new HashSet<>();
        for (int i = 0; i < giftCount; i++) {
            String gift = sc.next();
            giftList.add(gift);
        }
        System.out.println(giftList.size());
    }
}
