//85
public class func{
public void getInputPane(){
        final JScrollPane sp = getAnswerPane(Tools.getString("Dialog.About.Licences"));
        pane.add(sp);
        SpringUtilities.makeCompactGrid(pane, 1, 1,  //rows, cols
                                              1, 1,  //initX, initY
                                              1, 1); //xPad, yPad
}
}
