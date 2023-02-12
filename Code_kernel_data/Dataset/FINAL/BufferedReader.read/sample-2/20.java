public class func{
public void compare(String file1,String file2,BufferedReader in1,BufferedReader in2){
      String s2 = in2.readLine();
      if (!s1.equals(s2)) {
        System.out.println(
          "Files [" + file1 + "] and [" + file2 + "] differ on line "
          + lineCounter);
        System.out.println("One reads:  [" + s1 + "].");
        System.out.println("Other reads:[" + s2 + "].");
        outputFile(file1);
        outputFile(file2);

        return false;
      }
    if (in2.read() != -1) {
      System.out.println(
        "File [" + file2 + "] longer than file [" + file1 + "].");
      outputFile(file1);
      outputFile(file2);

      return false;
    }
}
}
