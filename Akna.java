import javax.swing.*;


public class Akna{
    public int sorszam=0;
    private int szomszedosBombak=0;
    private boolean vanBomba=false;


    public static void main(String[] args){
        JFrame theBoard = new JFrame();
        theBoard.setSize(400,400);
        theBoard.setLocationRelativeTo(null);
        theBoard.setResizable(false);
        theBoard.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        theBoard.setTitle("Aknakereso");
        
        JPanel thePanel = new JPanel();
        
        JTextField textField1 = new JTextField("Type Here", 15);
        JLabel label1 = new JLabel("valami");
        JButton button1 = new JButton("Send");
        ListenForButton lForButton = new ListenForButton();
        button1.addActionListener(lForButton);
        
        thePanel.add(label1);
        thePanel.add(button1);
        thePanel.add(textField1);
        
        theBoard.add(thePanel);
        theBoard.setVisible(true);
        
        System.out.println("Ez mar fut");
    }
}


   	// Implements ActionListener so it can react to events on components
    	private class ListenForButton implements ActionListener{
	     
	    // This method is called when an event occurs
	     
	    public void actionPerformed(ActionEvent e){
	         
	        // Check if the source of the event was the button
	         
	        if(e.getSource() == button1){
	             
	            //buttonClicked++;
	             
	            // Change the text for the label
	             
	            textArea1.append("Button clicked " + buttonClicked + " times\n" );
	             
            // e.getSource().toString() returns information on the button
	            // and the event that occurred
	                 
	        }
	         
    }
    }
    
    	// By using KeyListener you can track keys on the keyboard
	private class ListenForKeys implements KeyListener{
		
		// Handle the key typed event from the text field.
	    public void keyTyped(KeyEvent e) {
	    	textArea1.append("Key Hit: " + e.getKeyChar() + "\n"); 
	    }

	    // Handle the key-pressed event from the text field.
	    public void keyPressed(KeyEvent e) {
	        
	    }

	    // Handle the key-released event from the text field.
	    public void keyReleased(KeyEvent e) {
	        
	    }
		
	}
	
	private class ListenForMouse implements MouseListener{

		// Called when a mouse button is clicked
		
		public void mouseClicked(MouseEvent e) {
			
			textArea1.append("Mouse Panel Pos: " + e.getX() + " " + e.getY() + "\n");
			textArea1.append("Mouse Screen Pos: " + e.getXOnScreen() + " " + e.getYOnScreen() + "\n"); 
			textArea1.append("Mouse Button: " + e.getButton()  + "\n"); 
			textArea1.append("Mouse Clicks: " + e.getClickCount()  + "\n");
			
		}

		// Called when the mouse enters the component assigned
		// the MouseListener
		
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		// Called when the mouse leaves the component assigned
		// the MouseListener
		
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		// Mouse button pressed
		
		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		// Mouse button released
		
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	}
	     
