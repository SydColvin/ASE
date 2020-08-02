package views;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import model.Airport;

//GuiFrame for displaying desk information.

public class GuiFrame extends JFrame {
	private JButton updateButton = new JButton("Update");
	
	//Create Frame & panel
	public GuiFrame(Airport model){
		
		//Set Close by default close button of window
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		//Gui Title
		setTitle("Airport Check-in Status" ); 
		
		//Set Queue Display Panel
		add(BorderLayout.NORTH, new QueueDisplay(model));
		//Set Desk Display Panel
		add(BorderLayout.CENTER, new DeskDisplay(model));
		//Set Flight Display Panel
		add(BorderLayout.SOUTH, new FlightDisplay(model));
		// Set Update 
		add(BorderLayout.EAST, createUpdatePanel());

		setVisible(true);

	}
	
	public JPanel createUpdatePanel() {
		JPanel updatePanel = new JPanel(new BorderLayout());
		JPanel buttonPanel = new JPanel();
		buttonPanel.add(updateButton);
		updatePanel.add(BorderLayout.NORTH,buttonPanel);	
		return updatePanel;
	}
	
	public void addSetListener(ActionListener al) {
		updateButton.addActionListener(al);
	}

}
