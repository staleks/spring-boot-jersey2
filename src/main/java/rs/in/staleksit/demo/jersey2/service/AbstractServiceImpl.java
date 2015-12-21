package rs.in.staleksit.demo.jersey2.service;

import org.jtransfo.JTransfo;

public abstract class AbstractServiceImpl {
	
	private JTransfo jTransfo;
	
	protected JTransfo getJTransfo() {
		return jTransfo;
	}
	
	protected void setJTransfo(JTransfo jTransfo) {
		this.jTransfo = jTransfo;
	}

}
