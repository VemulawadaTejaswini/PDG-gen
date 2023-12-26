public class Main {
    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = null;
        try {
            s = br.readLine();
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        Date formatDate = null;
        try {
            formatDate = sdf.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Date compareDate = null;
        try {
            compareDate = sdf.parse("2019/04/30");
        } catch (ParseException e) {}
        if (formatDate.after(compareDate)) { 
            System.out.println("TBD");
        } else {
            System.out.println("Heisei");
        }
    }
}
