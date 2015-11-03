package city;

import java.util.ArrayList;
import java.util.List;

import city.inhabitant.Inhabitant;
import city.letter.Letter;

public class City {

	protected String name;
	protected List<Inhabitant> inhabitants;
	protected List<Letter> postBox;

	public City(String name, List<Inhabitant> inhabitants, List<Letter> postBox){
		this.name = name;
		this.inhabitants = inhabitants;
		this.postBox = postBox;
	}
	
	public void sendLetter(Letter letter){
		postBox.add(letter);
	}
	
	public void distributeLetter(){
		List<Letter> trash = new ArrayList<Letter>();
		for (Letter p : postBox){
			p.action();
			if (p.isReceived())
				trash.add(p);
		}
		postBox.removeAll(trash);
	}
	
	public String getName(){
		return name;
	}
	
	public List<Inhabitant> getInhabitants(){
		return inhabitants;
	}
	
	public List<Letter> getPostBox(){
		return postBox;
	}
}
