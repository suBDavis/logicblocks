package gates;

import main.LogicElement;

public class NandGate extends TwoInputGate {
	private static int nextId = 0;

	public NandGate(LogicElement input1, LogicElement input2, String name) {
		super(input1, input2, "Nand Gate " + name);
	}
	public NandGate(LogicElement input1, LogicElement input2) {
		super(input1, input2, "Nand Gate " + nextId);
		nextId++;
	}
	

	@Override
	public void updateAndStore() {
		this.newOutput = !(input1.getOutput() && input2.getOutput());		
	}

}
