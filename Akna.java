import java.awt.GridLayout;
import java.awt.event.*;

import javax.swing.*;


public class Akna extends JButton{
   
	/**
	 * 
	 */
	private static final long serialVersionUID =1L;
	
	public int xPosition=0;
	public int yPosition=0;
	public boolean vanBomba=false;
    public int szomszedosBombak=0;
    
    private boolean felVanFedve=false;
    public static Akna[][] aknaMezo =  new Akna[10][10];

    public static void main(String[] args){
        JFrame theBoard = new JFrame();
        theBoard.setSize(400,400);
        theBoard.setLocationRelativeTo(null);
        //theBoard.setResizable(false);
        theBoard.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        theBoard.setTitle("Aknakereso");
        
        JPanel thePanel = new JPanel();
        thePanel.setLayout(new GridLayout(10,10,0,0));
        //JTextField textField1 = new JTextField("Type Here", 15);
        //JLabel label1 = new JLabel("valami");
        //JButton button1 = new JButton("Send");
        ListenForMouse lForMouse = new ListenForMouse();
        //button1.addActionListener(lForButton);
        
        //thePanel.add(label1);
        //thePanel.add(button1);
        //thePanel.add(textField1);
        for(int i=0;i<10;i++){
        	for(int j=0;j<10;j++){
        		aknaMezo[i][j] = new Akna(i, j);
        		thePanel.add(aknaMezo[i][j]);
        		aknaMezo[i][j].addMouseListener(lForMouse);
        	}
        }
        int dbBomba=0;
        do{
        	int xRandom = (int)(Math.random()*9);
        	int yRandom = (int)(Math.random()*9);
        	if (!(aknaMezo[xRandom][yRandom].vanBomba)){
        		aknaMezo[xRandom][yRandom].vanBomba=true;
        		aknaMezo[xRandom][yRandom].szomszedosBombak=0;
        		aknaMezo[xRandom][yRandom].setText("B");
        		dbBomba++;
        		System.out.println(xRandom +" - "+yRandom);
        		aknaMezo[xRandom][yRandom].szomszedokErtesitese();
        	}
        }while(dbBomba<10);
        
        
        theBoard.add(thePanel);
        theBoard.setVisible(true);
        
        System.out.println("Ez mar fut");
    } //main
    
    
    public Akna(int xPos, int yPos){
    	this.xPosition = xPos;
    	this.yPosition = yPos;
    }
    
    public void felfed(){
    	if(!(this.getFelVanFedve())){
    		this.setFelVanFedve(true);
    	   	//this.setBorderPainted(false);
    		this.setContentAreaFilled(false);
    		if(this.szomszedosBombak==0){
    			if (!(this.vanBomba)){
    				this.setText("");
    				this.felderit(this.xPosition,this.yPosition);
    			}else {
    				this.setText("B");
    				//System.exit(0);
    			}
    			
    		}else{
    			this.setText(Integer.toString(this.szomszedosBombak));
    		}
    	}	
    }	//felfed

    public void megjelol(){
    	this.setText("*");
    	
    }
    
    public void felderit(int x, int y){
    	for (int i=-1;i<2;i++){
    		for (int j=-1;j<2;j++){
    			if(this.xPosition+i>=0 && this.xPosition+i<=9 && this.yPosition+j>=0 && this.yPosition+j<=9 && !(aknaMezo[this.xPosition+i][this.yPosition+j].getFelVanFedve())) {
    	    			aknaMezo[this.xPosition+i][this.yPosition+j].felfed();
    	    	}
    		}
    	}
    }    
    
    public void szomszedokErtesitese(){
    	for (int i=-1;i<2;i++){
    		for (int j=-1;j<2;j++){
    			if((this.xPosition+i>=0 && this.xPosition+i<=9 && this.yPosition+j>=0 && this.yPosition+j<=9) && !(aknaMezo[this.xPosition+i][this.yPosition+j].vanBomba)) {
    	    		aknaMezo[this.xPosition+i][this.yPosition+j].szomszedosBombak+=1;
    	    		aknaMezo[this.xPosition+i][this.yPosition+j].setText(Integer.toString(aknaMezo[this.xPosition+i][this.yPosition+j].szomszedosBombak));
    	    	}
    		}
    	}
    }

	
	public boolean getFelVanFedve() {
		return felVanFedve;
	}

	
	public void setFelVanFedve(boolean felVanFedve) {
		this.felVanFedve = felVanFedve;
	}


}

	class ListenForMouse implements MouseListener{
		
		public void mouseClicked(MouseEvent e) {
			if(e.getButton()==3){
				((Akna)e.getSource()).megjelol();
			} else{
				((Akna)e.getSource()).felfed();
			}
		}

		@Override
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		
	}
	     
