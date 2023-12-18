public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useDelimiter("\\s");
        List<Integer> numList = new ArrayList<>();
        for (int i = 0; i < 3; i++) numList.add(scanner.nextInt());
        Collections.sort(numList);
        StringBuilder strb = new StringBuilder();
        numList.forEach(s -> strb.append(s + " "));
        strb.delete(strb.length() - 1, strb.length());
        System.out.println(strb.toString());
    }
}
