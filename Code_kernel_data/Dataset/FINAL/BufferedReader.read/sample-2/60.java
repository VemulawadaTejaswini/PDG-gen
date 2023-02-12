public class func{
public void TagComparator(BufferedReader in){
            int result = in.read();
            if (result >= 0) {
                sb.append((char) result);
            } else {
                generateAtoms(sb.toString());
                allRead = true;
            }
}
}
