public class func{
public void updateDatabase(Connection c,String pathToSQLFile){
      FileReader fr = new FileReader(new File(pathToSQLFile));
      BufferedReader br = new BufferedReader(fr);
      while ((s = br.read()) != -1) {
        sb.appendCodePoint(s);
      }
      br.close();
}
}
