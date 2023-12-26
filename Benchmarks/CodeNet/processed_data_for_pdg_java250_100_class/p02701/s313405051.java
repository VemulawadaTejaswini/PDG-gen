public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> scList = new ArrayList<>();
        for (int i = 0; i >= 0; i++) {
            try {
                scList.add(scan.nextLine());
            } catch (Exception e) {
                break;
            }
        }
        Set<String> gacha = new HashSet<String>();
        for (int i = 0; i < scList.size(); i++) {
            if (i != 0) {
                gacha.add(scList.get(i));
            }
        }
        System.out.println(gacha.size());
    }
}
