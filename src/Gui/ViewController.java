package Gui;

import Gui.Util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;

public class ViewController {

	@FXML
	private Button btTest;
	
	@FXML
	public void onBtTestAction() {
		Alerts.ShowAlert("Alert Title", "Alert Header", "Hello !!", AlertType.INFORMATION);
	}
}
