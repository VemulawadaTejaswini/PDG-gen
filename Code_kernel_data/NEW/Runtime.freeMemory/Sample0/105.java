//104
public class func{
	public void updateState(){
    final Runtime runtime = Runtime.getRuntime();
    final long total = runtime.totalMemory() / MEGABYTE;
    final long used = total - runtime.freeMemory() / MEGABYTE;
    if (total != myLastTotal || used != myLastUsed) {
      myLastTotal = total;
      myLastUsed = used;
      //noinspection SSBasedInspection
      SwingUtilities.invokeLater(new Runnable() {
        public void run() {
          myBufferedImage = null;
          repaint();
        }
      });

      setToolTipText(UIBundle.message("memory.usage.panel.statistics.message", total, used));
    }
}
}
