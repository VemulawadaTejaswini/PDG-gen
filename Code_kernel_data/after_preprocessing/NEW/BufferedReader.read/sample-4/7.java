//7
public class func{
public void findProcessNameInLinuxWay(){
            while ((c = cmdlineReader.read()) > 0) {
                processName.append((char) c);
            }
            return processName.toString();
}
}
