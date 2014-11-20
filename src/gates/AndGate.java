package gates;

import main.LogicElement;

public class AndGate extends TwoInputGate {
	private static int nextId = 0;

	public AndGate(LogicElement input1, LogicElement input2, String name) {
		super(input1, input2, "And Gate " + name);
	}
	public AndGate(LogicElement input1, LogicElement input2) {
		super(input1, input2, "And Gate " + nextId);
		nextId++;
	}
	

	@Override
	public void updateAndStore() {
		this.newOutput = input1.getOutput() && input2.getOutput();		
	}

}
