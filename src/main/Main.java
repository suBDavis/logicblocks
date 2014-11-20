package main;

import gates.AndGate;
import gates.NorGate;


public class Main {
	public static void main(String[] args){
		LogicController LC = new LogicController();
		
		Switch true_ = new Switch ("true");
		true_.setOutput(true);
		LC.addElement(true_);
		
		Switch false_ = new Switch("false");
		LC.addElement(false_);
		
		Switch changeSwitch = new Switch("changeSwitch");
		changeSwitch.setOutput(true);
		LC.addElement(changeSwitch);
		
		AndGate a = new AndGate(changeSwitch, true_);
		LC.addElement(a);
		
		NorGate n = new NorGate(a, false_);
		LC.addElement(n);
		
		LC.doUpdateLoop(4);
		changeSwitch.setOutput(false);
		LC.doUpdateLoop(4);
	}
}
