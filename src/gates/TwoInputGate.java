package gates;

import main.LogicElement;

public abstract class TwoInputGate implements LogicElement {
	protected LogicElement input1, input2;
	private String name;
	protected boolean savedOutput = false, newOutput = false;
	
	TwoInputGate(LogicElement input1, LogicElement input2, String name){
		this.input1 = input1;
		this.input2 = input2;
		this.name = name;
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	public void setInput1(LogicElement input1){
		this.input1 = input1;
	}
	
	public void setInput2(LogicElement input2){
		this.input2 = input2;
	}

	@Override
	public boolean getOutput() {
		return savedOutput;
	}

	@Override
	public void updateOutput() {
		savedOutput = newOutput;

	}
	
	

}
