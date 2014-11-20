package gates;

import main.LogicElement;

public class NorGate extends TwoInputGate {
	private static int nextId = 0;

	public NorGate(LogicElement input1, LogicElement input2, String name) {
		super(input1, input2, "Nor Gate " + name);
	}
	public NorGate(LogicElement input1, LogicElement input2) {
		super(input1, input2, "Nor Gate " + nextId);
		nextId++;
	}
	

	@Override
	public void updateAndStore() {
		this.newOutput = !(input1.getOutput() || input2.getOutput());		
	}

}