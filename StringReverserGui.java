import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class StringReverserGui implements ActionListener, KeyListener{
	
	JFrame frame = new JFrame("gnirtS Reverser");
	JButton button = new JButton("Reverse String");
	JTextField text = new JTextField("Enter your String");
	JLabel message = new JLabel("Welcome to the String reverser ");
	JLabel result = new JLabel(" ");
	JPanel panel = new JPanel();
	Stringreverser sr = new Stringreverser();
	boolean firstpress = false;

	public static void main(String[] args){
		StringReverserGui srg = new StringReverserGui();
		srg.start();
	}
	public void start(){
		BoxLayout bl = new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS);
		frame.setLayout(bl);
		button.addActionListener(this);
		button.addKeyListener(this);
		text.addKeyListener(this);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(message);
		frame.add(text);
		frame.add(result);
		frame.add(button);
		frame.pack();
		frame.setSize(400,400);
		frame.setVisible(true);
		frame.getRootPane().setDefaultButton(button);

	}

	public void setLabel(){
			String in = text.getText();
			String out = sr.reverser(in);
			result.setText(out);
	}

	public void actionPerformed(ActionEvent ev){
		if(ev.getSource().equals(button)){
			setLabel();
		}
	}

	public void keyTyped(KeyEvent e){
		if(firstpress == false){
			text.setText("");
			firstpress = true;
		}
		
	}

	public void keyPressed(KeyEvent e){
		if(e.getKeyCode() == KeyEvent.VK_ENTER){
			setLabel();
		}
	}

	public void keyReleased(KeyEvent e){

	}
}