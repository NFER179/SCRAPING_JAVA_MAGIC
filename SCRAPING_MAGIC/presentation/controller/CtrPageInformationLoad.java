package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.VwPageInformationLoad;

public class CtrPageInformationLoad implements ActionListener {

	private VwPageInformationLoad vw;
	
	public CtrPageInformationLoad() {
		this.vw = new VwPageInformationLoad();
	}
	
	public void Init() {
		this.vw.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
