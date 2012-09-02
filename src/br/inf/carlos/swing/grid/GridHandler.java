package br.inf.carlos.swing.grid;

import java.awt.GridBagConstraints;

public class GridHandler implements Grid{

	private final GridifyHandler gridify;
	
	private final GridBagConstraints constraints;
	
	public GridHandler(Gridify gridify) {
		super();
		this.gridify = (GridifyHandler) gridify;
		
		this.constraints = this.gridify.getGridBagConstraints();
	}

	@Override
	public Gridify column(int column) {
		this.constraints.gridx = column;
		
		this.gridify.setGridBagConstraints(constraints);
		
		return this.gridify;
	}

	@Override
	public Gridify line(int line) {
		this.constraints.gridy = line;
		
		this.gridify.setGridBagConstraints(constraints);
		
		return this.gridify;
	}
}
