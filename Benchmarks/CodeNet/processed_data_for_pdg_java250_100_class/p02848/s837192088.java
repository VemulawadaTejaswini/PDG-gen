public class Main {
    public static void main(String[] args){
        String item[] = {
            "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L","M", "N",
            "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
        };
        List<String> list = Arrays.asList(item); 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        String temp[] = new String[s.length()];
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            temp[i] = String.valueOf(s.charAt(i));
        }
        for (int i = 0; i < temp.length; i++) {
            int place = list.indexOf(temp[i]);
            if (place + n <= 25) {
                ans += item[place + n];
            } else {
                ans += item[place + n-26];
            }
        }
        System.out.println(ans);
    }
}
