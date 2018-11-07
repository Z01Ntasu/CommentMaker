package application;

import java.util.ArrayList;

import javafx.beans.property.BooleanProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
	///////////////////// Ban Menu
	@FXML
	public CheckBox banCheckBoxN1;
	@FXML
	public CheckBox banCheckBoxN2;
	@FXML
	public CheckBox banCheckBoxN3;
	@FXML
	public CheckBox banCheckBoxN4;
	@FXML
	public CheckBox banCheckBoxN5;
	@FXML
	public CheckBox banCheckBoxN6;
	@FXML
	public CheckBox banCheckBoxN7;
	@FXML
	public CheckBox banCheckBoxN8;
	@FXML
	public CheckBox banCheckBoxN9;
	@FXML
	public CheckBox banCheckBoxN10;
	@FXML
	public CheckBox banCheckBoxN11;
	@FXML
	public CheckBox banCheckBoxN12;
	@FXML
	public CheckBox banCheckBoxN13;
	@FXML
	public CheckBox banCheckBoxN14;
	@FXML
	public CheckBox banCheckBoxN15;
	@FXML
	public CheckBox banCheckBoxN16;
	@FXML
	public CheckBox banCheckBoxN17;
	@FXML
	public CheckBox banCheckBoxN18;
	@FXML
	public CheckBox banCheckBoxN19;
	@FXML
	public CheckBox banCheckBoxN20;
	@FXML
	public CheckBox banCheckBoxN21;
	@FXML
	public CheckBox banCheckBoxN22;
	@FXML
	public CheckBox banCheckBoxN24;
	@FXML
	public CheckBox banCheckBoxN25;
	@FXML
	public CheckBox banCheckBoxN30;
	@FXML
	public TextArea banBegruendung;
	@FXML
	public TextField banDauer;
	@FXML
	public TextField banVideo1;
	@FXML
	public TextField banVideo2;
	@FXML
	public TextField banScreenshot;
	@FXML
	public TextField banLogs;
	
	///////////////////// Melden Menu
	@FXML
	public CheckBox meldenCheckBoxN1;
	@FXML
	public CheckBox meldenCheckBoxN2;
	@FXML
	public CheckBox meldenCheckBoxN3;
	@FXML
	public CheckBox meldenCheckBoxN4;
	@FXML
	public CheckBox meldenCheckBoxN5;
	@FXML
	public CheckBox meldenCheckBoxN6;
	@FXML
	public CheckBox meldenCheckBoxN7;
	@FXML
	public CheckBox meldenCheckBoxN8;
	@FXML
	public CheckBox meldenCheckBoxN9;
	@FXML
	public CheckBox meldenCheckBoxN10;
	@FXML
	public CheckBox meldenCheckBoxN11;
	@FXML
	public CheckBox meldenCheckBoxN12;
	@FXML
	public CheckBox meldenCheckBoxN13;
	@FXML
	public CheckBox meldenCheckBoxN14;
	@FXML
	public CheckBox meldenCheckBoxN15;
	@FXML
	public CheckBox meldenCheckBoxN16;
	@FXML
	public CheckBox meldenCheckBoxN17;
	@FXML
	public CheckBox meldenCheckBoxN18;
	@FXML
	public CheckBox meldenCheckBoxN19;
	@FXML
	public CheckBox meldenCheckBoxN20;
	@FXML
	public CheckBox meldenCheckBoxN21;
	@FXML
	public CheckBox meldenCheckBoxN22;
	@FXML
	public CheckBox meldenCheckBoxN24;
	@FXML
	public CheckBox meldenCheckBoxN25;
	@FXML
	public CheckBox meldenCheckBoxN30;	
	@FXML
	public TextArea meldenBegruendung;
	@FXML
	public TextField meldenVideo1;
	@FXML
	public TextField meldenVideo2;
	@FXML
	public TextField meldenScreenshot;
	@FXML
	public TextField meldenLogs;
	
	///////////////////// Verwarnungs Menu
	@FXML
	public CheckBox verWCheckBoxN1;
	@FXML
	public CheckBox verWCheckBoxN2;
	@FXML
	public CheckBox verWCheckBoxN3;
	@FXML
	public CheckBox verWCheckBoxN4;
	@FXML
	public CheckBox verWCheckBoxN5;
	@FXML
	public CheckBox verWCheckBoxN6;
	@FXML
	public CheckBox verWCheckBoxN7;
	@FXML
	public CheckBox verWCheckBoxN8;
	@FXML
	public CheckBox verWCheckBoxN9;
	@FXML
	public CheckBox verWCheckBoxN10;
	@FXML
	public CheckBox verWCheckBoxN11;
	@FXML
	public CheckBox verWCheckBoxN12;
	@FXML
	public CheckBox verWCheckBoxN13;
	@FXML
	public CheckBox verWCheckBoxN14;
	@FXML
	public CheckBox verWCheckBoxN15;
	@FXML
	public CheckBox verWCheckBoxN16;
	@FXML
	public CheckBox verWCheckBoxN17;
	@FXML
	public CheckBox verWCheckBoxN18;
	@FXML
	public CheckBox verWCheckBoxN19;
	@FXML
	public CheckBox verWCheckBoxN20;
	@FXML
	public CheckBox verWCheckBoxN21;
	@FXML
	public CheckBox verWCheckBoxN22;
	@FXML
	public CheckBox verWCheckBoxN24;
	@FXML
	public CheckBox verWCheckBoxN25;
	@FXML
	public CheckBox verWCheckBoxN30;	
	@FXML
	public TextArea verWBegruendung;
	@FXML
	public TextField verWVideo1;
	@FXML
	public TextField verWVideo2;
	@FXML
	public TextField verWScreenshot;
	@FXML
	public TextField verWLogs;
	
	///////////////////// Verwarnungs Menu
	@FXML
	public CheckBox nameCReb;
	@FXML
	public CheckBox nameCCiv;
	@FXML
	public CheckBox nameCFree;	
	@FXML
	public TextField nameCOlt;
	@FXML
	public TextField nameCNew;
	@FXML
	public TextField nameCFreeWhy;
	
	///////////////////// Erstattung Menu
	@FXML
	public TextField erstatMenge;
	@FXML
	public TextField erstatVideo;
	@FXML
	public TextField erstatScreen;	
	@FXML
	public TextField erstatLogs;
	@FXML
	public CheckBox erstatKulanz;
	@FXML
	public TextArea erstatBegruendung;
	
	///////////////////// Informations Menu
	@FXML
	public TextArea infoInfo;
	///////////////////// Fall unten Menu
	@FXML
	public TextArea fallUInhalt;
	///////////////////// Fall abgelehnt Menu
	@FXML
	public TextArea fallAbInhalt;
	@FXML
	public TextField fallAbVid;	
	
	@FXML
	public void banComment(ActionEvent event) {
		ArrayList<Boolean> inhalte = new ArrayList<Boolean>();
		inhalte.add(banCheckBoxN1.selectedProperty().get());
		inhalte.add(banCheckBoxN2.selectedProperty().get());
		inhalte.add(banCheckBoxN3.selectedProperty().get());
		inhalte.add(banCheckBoxN4.selectedProperty().get());
		inhalte.add(banCheckBoxN5.selectedProperty().get());
		inhalte.add(banCheckBoxN6.selectedProperty().get());
		inhalte.add(banCheckBoxN7.selectedProperty().get());
		inhalte.add(banCheckBoxN8.selectedProperty().get());
		inhalte.add(banCheckBoxN9.selectedProperty().get());
		inhalte.add(banCheckBoxN10.selectedProperty().get());
		inhalte.add(banCheckBoxN11.selectedProperty().get());
		inhalte.add(banCheckBoxN12.selectedProperty().get());
		inhalte.add(banCheckBoxN13.selectedProperty().get());
		inhalte.add(banCheckBoxN14.selectedProperty().get());
		inhalte.add(banCheckBoxN15.selectedProperty().get());
		inhalte.add(banCheckBoxN16.selectedProperty().get());
		inhalte.add(banCheckBoxN17.selectedProperty().get());
		inhalte.add(banCheckBoxN18.selectedProperty().get());
		inhalte.add(banCheckBoxN19.selectedProperty().get());
		inhalte.add(banCheckBoxN20.selectedProperty().get());
		inhalte.add(banCheckBoxN21.selectedProperty().get());
		inhalte.add(banCheckBoxN22.selectedProperty().get());
		inhalte.add(banCheckBoxN24.selectedProperty().get());
		inhalte.add(banCheckBoxN25.selectedProperty().get());
		inhalte.add(banCheckBoxN30.selectedProperty().get());
		String banBegrued = banBegruendung.getText();
		String banDau = banDauer.getText();
		String banVid1 = banVideo1.getText();
		String banVid2 = banVideo2.getText();
		String banScreen = banScreenshot.getText();
		String banLog = banLogs.getText();
		
		System.out.println(inhalte);
	}
	@FXML
	public void meldenComment(ActionEvent event) {
		ArrayList<Boolean> inhalte = new ArrayList<Boolean>();
		inhalte.add(meldenCheckBoxN1.selectedProperty().get());
		inhalte.add(meldenCheckBoxN2.selectedProperty().get());
		inhalte.add(meldenCheckBoxN3.selectedProperty().get());
		inhalte.add(meldenCheckBoxN4.selectedProperty().get());
		inhalte.add(meldenCheckBoxN5.selectedProperty().get());
		inhalte.add(meldenCheckBoxN6.selectedProperty().get());
		inhalte.add(meldenCheckBoxN7.selectedProperty().get());
		inhalte.add(meldenCheckBoxN8.selectedProperty().get());
		inhalte.add(meldenCheckBoxN9.selectedProperty().get());
		inhalte.add(banCheckBoxN10.selectedProperty().get());
		inhalte.add(banCheckBoxN11.selectedProperty().get());
		inhalte.add(banCheckBoxN12.selectedProperty().get());
		inhalte.add(banCheckBoxN13.selectedProperty().get());
		inhalte.add(banCheckBoxN14.selectedProperty().get());
		inhalte.add(banCheckBoxN15.selectedProperty().get());
		inhalte.add(banCheckBoxN16.selectedProperty().get());
		inhalte.add(banCheckBoxN17.selectedProperty().get());
		inhalte.add(banCheckBoxN18.selectedProperty().get());
		inhalte.add(banCheckBoxN19.selectedProperty().get());
		inhalte.add(banCheckBoxN20.selectedProperty().get());
		inhalte.add(banCheckBoxN21.selectedProperty().get());
		inhalte.add(banCheckBoxN22.selectedProperty().get());
		inhalte.add(banCheckBoxN24.selectedProperty().get());
		inhalte.add(banCheckBoxN25.selectedProperty().get());
		inhalte.add(banCheckBoxN30.selectedProperty().get());
		String banBegrued = banBegruendung.getText();
		String banDau = banDauer.getText();
		String banVid1 = banVideo1.getText();
		String banVid2 = banVideo2.getText();
		String banScreen = banScreenshot.getText();
		String banLog = banLogs.getText();
		
		System.out.println(inhalte);
	}
	
	
}
