//Jacob Battenfield
//Find me on LinkedIn :)
//1-31-2024
//www.linkedin.com/in/jacob-jbatt

package OptionPain;
import javax.swing.JOptionPane;
public class Options {

    public static void main(String[] args) {
        Paths path = new Paths();
        int doorNum =Integer.parseInt(JOptionPane.showInputDialog("Which do you enter? Door 1 or Door 2?"));

        if(doorNum==1){
        JOptionPane.showMessageDialog(null, "You have chosen door "+doorNum+". Wise choice, friend.");
        path.Path1();
        }
        if(doorNum==2){
        JOptionPane.showMessageDialog(null, "You have chosen door "+doorNum+". May Hell have pity on you.");
        path.Path2();
        }else{
        JOptionPane.showMessageDialog(null, "You have chosen not to do anything... you're no fun...");
        path.Path3();
        }

    }
    
}
