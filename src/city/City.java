package city;

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
		//TODO
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