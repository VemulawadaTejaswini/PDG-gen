public class func{
public void handleStreams(DataOutputStream out,InputStream in,String[] parameters){
      String line = dis.readLine().trim();
      if (line.length() == 0)
        continue;
      if (line.equals("exit")) {
        boolean mayExit = true;
        for (int i = 0; i < runningStages.size(); i++) {
          Stage stage = (Stage) runningStages.get(i);
          if (stage.isAlive()) {
            consoleOut.println("There are still running stages.");
            mayExit = false;
            break;
          }
        }
        if (mayExit)
          break;
        else
          continue;
      }
      if (line.equals("help")) {
        consoleOut.println("Type a number to switch to that stage.");
        consoleOut.println("Type a new stage with args to run it.");
        consoleOut.println("While connected, type ]> to get back to this prompt.");
        continue;
      }
        int number = Integer.parseInt(line);
}
}
