//18
public class func{
public void actionPerformedImpl(ActionEvent e,RTextArea textArea){
      DateFormat timeDateStamp = DateFormat.getDateTimeInstance();
      String dateString = timeDateStamp.format(today);
      textArea.replaceSelection(dateString);
}
}
