public class func{
public void run(){
      while (ch != -1) {
        while ((ready = reader.ready()) && (ch = reader.read()) != -1) {
          sb.append((char)ch);
          if ((char)ch == '\n') {
            this.inputListener.notifyInputLine(sb.toString());
            sb = new StringBuilder();
          }
        }
        if (!ready) {
          if (!ProcessUtils.isProcessAlive(process)) {
            if (!continueReading.isRunning()) {
              continueReading.start();
            } else if (continueReading.elapsedTimeMillis() > continueReadingMillis) {
              return;
            }
          }
          Thread.sleep(10);
        }
      }
}
}
