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
        JLabel label1 = new JLabel("valami");
        thePanel.add(label1);
        theBoard.add(thePanel);
        
        
        System.out.println("Ez mar fut");
    }
}
