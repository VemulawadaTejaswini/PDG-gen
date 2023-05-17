//392
public class func{
public void fillMainPanel(SensorsScenarioView scenarioView){
    DevicePanel devicePanel = new DevicePanel(Global.W_DEVICE_SMALL,
        Global.H_DEVICE_SMALL, mModel, scenarioView);
    panel.add(devicePanel, BorderLayout.CENTER);
    panel.setMinimumSize(devicePanel.getPreferredSize());
}
}
