public class Main {
    public static void main(String[] args) {
        final int SEC_FOR_HOUR = 3600;
        final int SEC_FOR_MINUTE = 60;
        Scanner sc = new Scanner(System.in);
        int inputSec = 0;
        try {
            inputSec = sc.nextInt();
        } catch (Exception e) {
        } finally {
            sc.close();
        }
        int hour = inputSec / SEC_FOR_HOUR;
        int wkSec = inputSec - hour * SEC_FOR_HOUR;
        int minute = wkSec / SEC_FOR_MINUTE;
        wkSec = wkSec - minute * SEC_FOR_MINUTE;
        int second = wkSec;
        StringBuffer sb = new StringBuffer();
        sb.append(hour + ":" + minute + ":" + second);
        System.out.println(sb);
    }
}
