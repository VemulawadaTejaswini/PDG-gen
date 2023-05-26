public class func{
public void addEmptySpace(JPanel panel,int size){
        panel.add(Box.createVerticalStrut(size),
                new GridBagConstraints(0, linesCount++,
                2, 1,
                1.0, 0.0,
                GridBagConstraints.CENTER,
                GridBagConstraints.VERTICAL,
                new Insets(6, 0, 0, 0),
                0, 0));
}
}
