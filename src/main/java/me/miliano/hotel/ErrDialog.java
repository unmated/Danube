package me.miliano.hotel;

import java.awt.Component;

import javax.swing.JOptionPane;

public class ErrDialog {

	public ErrDialog(Component cmp, String msg) {
		JOptionPane.showOptionDialog(cmp, msg, "Warning", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
				null, null, null);
	}
}