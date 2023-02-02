//4
public class func{
public void createCenterPanel(){
    for (VcsPushOptionsPanel panel : myAdditionalPanels.values()) {
      optionsPanel.add(panel);
    }
    rootPanel.add(optionsPanel, BorderLayout.SOUTH);
}
}
