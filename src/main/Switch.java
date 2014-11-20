package main;


public class Switch implements LogicElement {
    boolean myValue;
    boolean newValue;
    String name;
    static int nextId = 0;
    
    public Switch(String name){
    	this.name = "Switch " + name;
    	nextId++;
    	newValue = false;
    	updateOutput();
    }
    
    public Switch(){
    	this(nextId + "");
    }
    
    public void setOutput(boolean output){
    	newValue = output;
    }
    
	@Override
	public String getName() {
		return name;
	}

	@Override
	public boolean getOutput() {
		return myValue;
	}

	@Override
	public void updateAndStore() {
		
	}

	@Override
	public void updateOutput() {
		myValue = newValue;

	}

}
