package gates;

import main.LogicElement;

public class OrGate extends TwoInputGate {
	private static int nextId = 0;

	public OrGate(LogicElement input1, LogicElement input2, String name) {
		super(input1, input2, "Or Gate " + name);
	}
	public OrGate(LogicElement input1, LogicElement input2) {
		super(input1, input2, "Or Gate " + nextId);
		nextId++;
	}
	

	@Override
	public void updateAndStore() {
		this.newOutput = input1.getOutput() || input2.getOutput();		
	}

}