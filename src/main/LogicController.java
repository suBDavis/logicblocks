package main;
import java.util.ArrayList;
import java.util.List;


public class LogicController {
	private List<LogicElement> elementList = new ArrayList<LogicElement>();
	
	public void doUpdateLoop(int n){
		for(int i=0; i < n; i++){
			System.out.println("\nCycle " + i + ":");
			for(LogicElement element : elementList){
				element.updateAndStore();
			}
			for(LogicElement element : elementList){
				element.updateOutput();
				System.out.println(element.getName() + " = " + element.getOutput());
			}
		}
	}
	
	public void addElement(LogicElement element){
		elementList.add(element);
	}

}
