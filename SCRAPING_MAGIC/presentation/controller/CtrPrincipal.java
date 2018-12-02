package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.VwPrincipal;

public class CtrPrincipal implements ActionListener{

	private VwPrincipal vt;
	
	public CtrPrincipal() {
		this.vt = new VwPrincipal();
		this.addListener();
	}
	
	private void addListener() {
		this.vt.getBtnAddCard().addActionListener(this);		
	}
	
	public void Init() {
		this.vt.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == this.vt.getBtnAddCard()) {
			CtrPageInformationLoad ctr = new CtrPageInformationLoad();
			ctr.Init();
		}
	}
}