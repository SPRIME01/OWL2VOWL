package de.uni_stuttgart.vis.vowl.owl2vowl.model.nodes.classes;


import de.uni_stuttgart.vis.vowl.owl2vowl.constants.Node_Types;
import de.uni_stuttgart.vis.vowl.owl2vowl.export.JsonGeneratorVisitor;

public class RdfsClass extends BaseClass {

	public RdfsClass() {
		super();
		setType(Node_Types.TYPE_RDFSCLASS);
	}

	@Override
	public void accept(JsonGeneratorVisitor visitor) {
		visitor.visit(this);
	}
}
