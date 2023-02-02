//23
public class func{
public void echo(){
      FileReader fileReader = closer.register(new FileReader("/etc/hosts"));
      BufferedReader bufferedReader = closer.register(new BufferedReader(fileReader));
      return bufferedReader.readLine();
}
}
