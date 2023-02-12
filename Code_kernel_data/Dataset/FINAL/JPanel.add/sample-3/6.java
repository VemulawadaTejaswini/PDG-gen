public class func{
public void buildContentPanel(){
        tblContent.addMouseListener(new PopupMenuLauncher(new ChangesetContentTablePopupMenu()));
        pnl.add(new JScrollPane(tblContent), BorderLayout.CENTER);
}
}
