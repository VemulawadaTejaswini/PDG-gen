public class Main {
    public static void main(String...args) {
        try (Scanner sc = new Scanner(System.in)) {
            String s = sc.next();
            String array[] = s.split("");
            int a = -1;
            int z = 0;
            for (int i = 0; i < array.length; i++) {
                if (a < 0) {
                    if (array[i].equals("A")) {
                        a = i;
                    }
                } else {
                    if (array[i].equals("Z")) {
                        z = i;
                    }
                }
            }
            System.out.println(z - a + 1);
        }
    }
}
