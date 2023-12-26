public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numStrings = scanner.nextInt();
        int stringLen = scanner.nextInt(); 
        scanner.nextLine();
        List<String> strings = new ArrayList<>();
        for (int i=0; i<numStrings; i++) {
            String curr = scanner.nextLine();
            strings.add(curr);
        }
        Collections.sort(strings);
        StringBuilder sb = new StringBuilder();
        for (String s : strings) {
            sb.append(s);
        }                       
        scanner.close();            
        System.out.println(sb.toString());
    }
}
