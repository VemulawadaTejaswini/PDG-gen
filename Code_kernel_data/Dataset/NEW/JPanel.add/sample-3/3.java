//3
public class func{
public void createDetailTextArea(){
        detailTextArea = new JTextArea(5, 80);
        detailTextArea.setEditable(false);
        JScrollPane detailScrollPane = new JScrollPane(detailTextArea,
                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        detailPanel.add(detailScrollPane, BorderLayout.SOUTH);
}
}
