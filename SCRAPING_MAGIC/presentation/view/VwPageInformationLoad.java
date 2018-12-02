package view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class VwPageInformationLoad extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4238702428690379559L;

	private JPanel contentPanel;
	
	/* Frame properties. */
	private int iWidth = 800;
	private int iHeigth = 500;
	
	/* Element of Frame. */
	private JTextField txtPageName;
	private JButton btnSave;
	
	public VwPageInformationLoad() {
		this.setBounds(100, 100, this.iWidth, this.iHeigth);
		this.contentPanel = new JPanel();
		this.contentPanel.setBorder(new EmptyBorder(5,5,5,5));
		this.contentPanel.setLayout(null);
		this.setContentPane(this.contentPanel);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);

		this.txtPageName = new JTextField("hola");
		this.txtPageName.setBounds(5, 5, 700, 30);
		this.txtPageName.setColumns(0);
		this.contentPanel.add(this.txtPageName);
		
		this.btnSave = new JButton("Guardar");
		this.btnSave.setBackground(Color.GREEN);
		this.btnSave.setBounds(5, 45, 80, 30);
		this.contentPanel.add(this.btnSave);
	}

	/**
	 * @return the contentPanel
	 */
	public JPanel getContentPanel() {
		return contentPanel;
	}

	/**
	 * @return the txtPageName
	 */
	public JTextField getTxtPageName() {
		return txtPageName;
	}

	/**
	 * @return the btnSave
	 */
	public JButton getBtnSave() {
		return btnSave;
	}
}