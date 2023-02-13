public class func{
public void getInputPane(){
        final JScrollPane sp = getAnswerPane(Tools.getString("Dialog.About.Licences"));
        pane.add(sp);
        SpringUtilities.makeCompactGrid(pane, 1, 1,
                                              1, 1,
                                              1, 1);
}
}
