package city.letter;

import city.inhabitant.Inhabitant;
import city.letter.content.Content;

public abstract class Letter <T extends Content>{
	protected Inhabitant sender;
	protected Inhabitant receiver;
	protected T content;
	protected double cost;
	
	public Letter(Inhabitant sender, Inhabitant receiver, T content, double cost){
		this.sender = sender;
		this.receiver = receiver;
		this.content = content;
		this.cost = cost;
	}
	
	public abstract void action();
	
	public Inhabitant getSender(){
		return sender;
	}
	
	public Inhabitant getReceiver(){
		return receiver;
	}
	
	public T getContent(){
		return content;
	}
	
	public double getCost(){
		return cost;
	}
}
