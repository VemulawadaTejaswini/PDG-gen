//14
public class func{
public void isFastChargeOn(){
            File fastcharge = new File(FAST_CHARGE_DIR, FAST_CHARGE_FILE);
            FileReader reader = new FileReader(fastcharge);
            BufferedReader breader = new BufferedReader(reader);
            return (breader.readLine().equals("1"));
}
}
