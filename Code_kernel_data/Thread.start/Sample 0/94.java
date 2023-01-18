//93
public class func{
	public void displayHelpGUI(){
    Thread helpGUIThread = new Thread("DisplayHelpGUIThread") {
      public void run() {
        boolean ok = new HelpGUI(DatabaseImportMain.class.getResourceAsStream("help_import_main.html")).display();
        if (!ok) {
          System.out.println("Error displaying helpfile " + "help_import_main.html");
        }
      }
    };
    helpGUIThread.start();
}
}
