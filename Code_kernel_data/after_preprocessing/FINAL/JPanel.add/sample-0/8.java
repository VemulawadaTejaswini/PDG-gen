public class func{
public void buildMainPanelAboveDownloadSelections(JPanel pnl){
            pnl.add(new JLabel(tr("Overpass query: ")), GBC.std().insets(5, 5, 5, 5));
            GridBagConstraints gbc = GBC.eol().fill();
            pnl.add(scrollPane, gbc);
}
}
