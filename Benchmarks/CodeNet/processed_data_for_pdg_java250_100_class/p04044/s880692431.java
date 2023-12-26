class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int volume = scanner.nextInt();
        int length = scanner.nextInt();
        List<String> list = new ArrayList<>();
        for (int n = 0; n < volume; n ++) {
            String word = scanner.next();
            list.add(word);
        }
        List<String> sortedList = list.stream().sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
        String result = "";
        for (String word : sortedList) {
            result += word;
        }
        System.out.println(result);
    }
}
