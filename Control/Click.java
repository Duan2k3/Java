package Control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import View.QLSVview;
import View.Them;

public class Click implements ActionListener {
private QLSVview qlsVview;

public Click(QLSVview qlsVview, Them them) {
	super();
	this.qlsVview = qlsVview;
	this.them = them;
}

private Them them;

@Override
public void actionPerformed(ActionEvent e) {
	String src = e.getActionCommand();
	if(src.equals("Thêm sinh viên")) {
	Them themview = new Them();
	themview.setVisible(true);
	
	}
	
}

}
