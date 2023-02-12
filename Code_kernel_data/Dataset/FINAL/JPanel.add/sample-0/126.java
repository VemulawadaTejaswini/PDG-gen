public class func{
public void createOccurrencesCb(GridBagConstraints gbConstraints,JPanel panel,final int occurenceNumber){
    myCbReplaceAllOccurences.setText(RefactoringBundle.message("replace.all.occurences", occurenceNumber));
    panel.add(myCbReplaceAllOccurences, gbConstraints);
    myCbReplaceAllOccurences.setSelected(false);
}
}
