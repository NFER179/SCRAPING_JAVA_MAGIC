package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**
 * 
 * @author NFERNANDEZ
 *
 */
public class VwPrincipal extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPanel;
	
	/* Frame properties. */
	private int iWidth = 800;
	private int iHeigth = 500;
	
	/* Element of Frame. */
	private JButton btnAddCard;
	
	public VwPrincipal() {
		this.setBounds(100, 100, this.iWidth, this.iHeigth);
		this.contentPanel = new JPanel();
		this.contentPanel.setBorder(new EmptyBorder(5,5,5,5));
		this.contentPanel.setLayout(null);
		this.setContentPane(this.contentPanel);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		this.btnAddCard = new JButton("Agregar Carta");
		this.btnAddCard.setBounds(5, 5, 80, 50);
		this.contentPanel.add(this.btnAddCard);
	}

	/**
	 * @return the contentPanel
	 */
	public JPanel getContentPanel() {
		return contentPanel;
	}

	/**
	 * @return the btnAddCard
	 */
	public JButton getBtnAddCard() {
		return btnAddCard;
	}	
}