package Strings;

import java.util.ArrayList;
import application.Controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;


public class StringGeneration {
	
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
		
		System.out.println(mainString);
	}



}
