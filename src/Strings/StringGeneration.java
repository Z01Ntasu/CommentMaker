package Strings;

import java.util.ArrayList;
import application.Controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class StringGeneration {
	
	public static void createStringSuppMelden(Label commentSupp,ArrayList<Boolean> inhalte,String meldenBegruendung,String meldenVid1,String meldenVid2,String meldenScreen,String meldenLog) {
		String mainString ="";
		if (inhalte.get(0) == true) {
			mainString += " #1";
		}
		if (inhalte.get(1) == true) {
			mainString += " #2";
		}
		if (inhalte.get(2) == true) {
			mainString += " #3";
		}
		if (inhalte.get(3) == true) {
			mainString += " #4";
		}
		if (inhalte.get(4) == true) {
			mainString += " #5";
		}
		if (inhalte.get(5) == true) {
			mainString += " #6";
		}
		if (inhalte.get(6) == true) {
			mainString += " #7";
		}
		if (inhalte.get(7) == true) {
			mainString += " #8";
		}
		if (inhalte.get(8) == true) {
			mainString += " #9";
		}
		if (inhalte.get(9) == true) {
			mainString += " #10";
		}
		if (inhalte.get(10) == true) {
			mainString += " #11";
		}
		if (inhalte.get(11) == true) {
			mainString += " #12";
		}
		if (inhalte.get(12) == true) {
			mainString += " #13";
		}
		if (inhalte.get(13) == true) {
			mainString += " #14";
		}
		if (inhalte.get(14) == true) {
			mainString += " #15";
		}
		if (inhalte.get(15) == true) {
			mainString += " #16";
		}
		if (inhalte.get(16) == true) {
			mainString += " #17";
		}
		if (inhalte.get(17) == true) {
			mainString += " #18";
		}
		if (inhalte.get(18) == true) {
			mainString += " #19";
		}
		if (inhalte.get(19) == true) {
			mainString += " #20";
		}
		if (inhalte.get(20) == true) {
			mainString += " #21";
		}
		if (inhalte.get(21) == true) {
			mainString += " #22";
		}
		if (inhalte.get(22) == true) {
			mainString += " #24";
		}
		if (inhalte.get(23) == true) {
			mainString += " #25";
		}
		if (inhalte.get(24) == true) {
			mainString += " #30";
		}
		
		mainString += " | ";
		mainString += "Im Support melden";
		mainString += " | ";
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("ddMMyy");  
		   LocalDateTime now = LocalDateTime.now(); 
		mainString += dtf.format(now)+"\n";   
		mainString += meldenBegruendung + "\n";
		
		
		if (meldenVid1.startsWith("h")) {
			mainString += "Video 1. : " + meldenVid1 + "\n";
		}
		if (meldenVid2.startsWith("h")) {
			mainString += "Video 2. : " + meldenVid2 + "\n";
		}
		if (meldenScreen.startsWith("h")) {
			mainString += "Screenshot : " + meldenScreen + "\n";
		}
		if (meldenLog.startsWith("h")) {
			mainString += "Logs : " + meldenLog + "\n";
		}
		commentSupp.setText(mainString);
		
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(
                new StringSelection(mainString), null
           );
		
		
	}
	
	public static void createStringVerW(Label commentSupp,ArrayList<Boolean> inhalte,String meldenBegruendung,String meldenVid1,String meldenVid2,String meldenScreen,String meldenLog) {
		String mainString ="#########";
		if (inhalte.get(0) == true) {
			mainString += " #1";
		}
		if (inhalte.get(1) == true) {
			mainString += " #2";
		}
		if (inhalte.get(2) == true) {
			mainString += " #3";
		}
		if (inhalte.get(3) == true) {
			mainString += " #4";
		}
		if (inhalte.get(4) == true) {
			mainString += " #5";
		}
		if (inhalte.get(5) == true) {
			mainString += " #6";
		}
		if (inhalte.get(6) == true) {
			mainString += " #7";
		}
		if (inhalte.get(7) == true) {
			mainString += " #8";
		}
		if (inhalte.get(8) == true) {
			mainString += " #9";
		}
		if (inhalte.get(9) == true) {
			mainString += " #10";
		}
		if (inhalte.get(10) == true) {
			mainString += " #11";
		}
		if (inhalte.get(11) == true) {
			mainString += " #12";
		}
		if (inhalte.get(12) == true) {
			mainString += " #13";
		}
		if (inhalte.get(13) == true) {
			mainString += " #14";
		}
		if (inhalte.get(14) == true) {
			mainString += " #15";
		}
		if (inhalte.get(15) == true) {
			mainString += " #16";
		}
		if (inhalte.get(16) == true) {
			mainString += " #17";
		}
		if (inhalte.get(17) == true) {
			mainString += " #18";
		}
		if (inhalte.get(18) == true) {
			mainString += " #19";
		}
		if (inhalte.get(19) == true) {
			mainString += " #20";
		}
		if (inhalte.get(20) == true) {
			mainString += " #21";
		}
		if (inhalte.get(21) == true) {
			mainString += " #22";
		}
		if (inhalte.get(22) == true) {
			mainString += " #24";
		}
		if (inhalte.get(23) == true) {
			mainString += " #25";
		}
		if (inhalte.get(24) == true) {
			mainString += " #30";
		}
		
		mainString += " ";
		mainString += "Verwarnung ";
		mainString += "#########\n";   
		mainString += meldenBegruendung + "\n";
		
		
		if (meldenVid1.startsWith("h")) {
			mainString += "Video 1. : " + meldenVid1 + "\n";
		}
		if (meldenVid2.startsWith("h")) {
			mainString += "Video 2. : " + meldenVid2 + "\n";
		}
		if (meldenScreen.startsWith("h")) {
			mainString += "Screenshot : " + meldenScreen + "\n";
		}
		if (meldenLog.startsWith("h")) {
			mainString += "Logs : " + meldenLog + "\n";
		}
		commentSupp.setText(mainString);
		
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(
                new StringSelection(mainString), null
           );
		
		
	}
	
	public static void createStringBan(Label commentBan,ArrayList<Boolean> inhalte,String banBegrued,String banDau,String banVid1,String banVid2,String banScreen,String banLog) {
		String mainString ="";
		if (inhalte.get(0) == true) {
			mainString += " #1";
		}
		if (inhalte.get(1) == true) {
			mainString += " #2";
		}
		if (inhalte.get(2) == true) {
			mainString += " #3";
		}
		if (inhalte.get(3) == true) {
			mainString += " #4";
		}
		if (inhalte.get(4) == true) {
			mainString += " #5";
		}
		if (inhalte.get(5) == true) {
			mainString += " #6";
		}
		if (inhalte.get(6) == true) {
			mainString += " #7";
		}
		if (inhalte.get(7) == true) {
			mainString += " #8";
		}
		if (inhalte.get(8) == true) {
			mainString += " #9";
		}
		if (inhalte.get(9) == true) {
			mainString += " #10";
		}
		if (inhalte.get(10) == true) {
			mainString += " #11";
		}
		if (inhalte.get(11) == true) {
			mainString += " #12";
		}
		if (inhalte.get(12) == true) {
			mainString += " #13";
		}
		if (inhalte.get(13) == true) {
			mainString += " #14";
		}
		if (inhalte.get(14) == true) {
			mainString += " #15";
		}
		if (inhalte.get(15) == true) {
			mainString += " #16";
		}
		if (inhalte.get(16) == true) {
			mainString += " #17";
		}
		if (inhalte.get(17) == true) {
			mainString += " #18";
		}
		if (inhalte.get(18) == true) {
			mainString += " #19";
		}
		if (inhalte.get(19) == true) {
			mainString += " #20";
		}
		if (inhalte.get(20) == true) {
			mainString += " #21";
		}
		if (inhalte.get(21) == true) {
			mainString += " #22";
		}
		if (inhalte.get(22) == true) {
			mainString += " #24";
		}
		if (inhalte.get(23) == true) {
			mainString += " #25";
		}
		if (inhalte.get(24) == true) {
			mainString += " #30";
		}
		mainString += " | ";
		mainString += banDau + "\n";
		mainString += banBegrued + "\n";
		
		if (banVid1.startsWith("h")) {
			mainString += "Video 1. : " + banVid1 + "\n";
		}
		if (banVid2.startsWith("h")) {
			mainString += "Video 2. : " + banVid2 + "\n";
		}
		if (banScreen.startsWith("h")) {
			mainString += "Screenshot : " + banScreen + "\n";
		}
		if (banLog.startsWith("h")) {
			mainString += "Logs : " + banLog + "\n";
		}
		commentBan.setText(mainString);
		
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(
                new StringSelection(mainString), null
           );
		
		
	}
	
	public static void NameCComment(String alterName,String neuerName ,String kostenlosBegr,boolean rebselect,boolean civSelect,boolean freeName,Label commentNameC) {
		String mainString = "";
		double Preis = 0;

		mainString += "#Namechange | ";
		if(rebselect == true) {
			mainString += "Reb ";
			Preis += 1;
		}
		if(civSelect == true) {
			mainString += "Civ";
			Preis += 0.5;
		}
		mainString += "\n";
		
		if (freeName == true) {
			mainString += "Kostenllos weil " + kostenlosBegr + "\n";
		} else   {
			mainString += "Kosten : "  + Preis + " Millionen"+ "\n";
			
		}
		
		mainString += alterName + " --> " + neuerName;
		commentNameC.setText(mainString);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(
                new StringSelection(mainString), null
           );
		
	}
	public static void erstattungComment(String menge,String erstattVideo,String erstattScreen,String erstattLogs,String erstattBegrued,boolean kulanz,Label labelErstattung) {
		String mainString = "";
		if(kulanz == true) {
			mainString += "#Kulanz " + menge + "\n";
		} else {
			mainString += "#Erstattung " + menge + "\n";
		}
		mainString += erstattBegrued + "\n";
		
		if (erstattVideo.startsWith("h")) {
			mainString += "Video 1. : " + erstattVideo + "\n";
		}
		if (erstattScreen.startsWith("h")) {
			mainString += "Screenshot : " + erstattScreen + "\n";
		}
		if (erstattLogs.startsWith("h")) {
			mainString += "Logs : " + erstattLogs + "\n";
		}
		labelErstattung.setText(mainString);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(
                new StringSelection(mainString), null
           );
		
		
	}
	public static void infoComment(String info,Label infoString) {
		String mainString = "";
		mainString += "#Information" + "\n";
		mainString += info;
		infoString.setText(mainString);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(
                new StringSelection(mainString), null
        );
	} 
	public static void fallUntenComment(String info,Label untenString) {
		String mainString = "";
		mainString += "#Fall unten" + "\n";
		mainString += info;
		untenString.setText(mainString);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(
                new StringSelection(mainString), null
        );
	}
	
	public static void abgelehntComment (String info,String vid, Label abgelehntString) {
		String mainString = "";
		mainString += "#Fall abgelehnt" + "\n";
		mainString += info + "\n";
		
		if(vid.startsWith("h")) {
			mainString += "Video: " +  vid;
		}
		abgelehntString.setText(mainString);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(
                new StringSelection(mainString), null
        );
	}

	


}