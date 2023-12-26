public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        try {
            DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
            Date date1 = sdf.parse(a);
            Date date2 = sdf.parse("2019/04/30");
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
