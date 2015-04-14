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
	     
