import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.io.File;
import java.lang.ProcessBuilder;
import java.net.http.WebSocket.Listener;
import java.util.List;

public class GUI implements Listener
{
	public GUI()
	{
		File programList = new File("Z:\\admintools\\Installs\\Installer Only");
		String programs[] = programList.list();
		
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JComboBox dropDown = new JComboBox(programs);
		JButton button = new JButton("Install");
		JLabel label = new JLabel("You are installing..." );
		
		
		panel.setBorder(BorderFactory.createEmptyBorder(200, 200, 200, 200));
		panel.setLayout(new GridLayout(0, 1));
		panel.add(dropDown);
		panel.add(button);
		panel.add(label);
		
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("IT Installer");
		frame.pack();
		frame.setVisible(true);
		
		
	}
	public static void main(String[] args) 
	{
		new GUI();
	}

	public static void installer(String name)
	{
		File installLocation = new File("Z:\\admintools\\Installs\\Installer Only\\" + name);
		ProcessBuilder build = new ProcessBuilder();
		build.directory(installLocation);
		
	}
}
