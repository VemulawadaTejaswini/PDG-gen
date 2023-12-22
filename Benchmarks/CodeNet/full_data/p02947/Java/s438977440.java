public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int n = std.nextInt();

        String[] texts = new String[n];
        for (int i = 0; i < n; i++) {
            texts[i] = std.next();
        }

        String[] sortedTexts = new String[n];

        for (int i = 0; i < n; i++) {
            String text = texts[i];
            List<String> textList = Arrays.asList(text.split(""));
            Collections.sort(textList);
            String sorted = String.join("",textList);
            sortedTexts[i] = sorted;
        }


        long count = 0;

        count = count / 2;

        System.out.println(count);
    }
}