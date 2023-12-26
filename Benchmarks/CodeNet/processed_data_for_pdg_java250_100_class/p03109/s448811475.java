public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.JAPAN);
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        try {
            Date date1 = DateFormat.getDateInstance().parse(a);
            Date date2 = DateFormat.getDateInstance().parse("2019/04/30");
            int diff = date1.compareTo(date2);
            if (diff > 0) {
                System.out.println("TBD");
            } else {
                System.out.println("Heisei");
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
