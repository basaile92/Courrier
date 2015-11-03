package main;

import java.util.ArrayList;
import java.util.List;

import city.City;
import city.inhabitant.Inhabitant;
import city.letter.Letter;
import city.letter.SimpleLetter;
import city.letter.content.Content;
import city.letter.content.Text;

public class MainTest {

	public static void main(String[] args){
		Inhabitant a = new Inhabitant("a", 1000);
		Inhabitant b = new Inhabitant("b", 1000);
		
		Letter l1 = new SimpleLetter(a, b, "Salut !",1);
		Letter l2 = new SimpleLetter(b, a, "Salut, ça va ?",1);
		
		List<Inhabitant> inhabitants = new ArrayList<Inhabitant>();
		List<Letter> postBox = new ArrayList<Letter>();
		
		inhabitants.add(a);
		inhabitants.add(b);
		
		postBox.add(l1);
		postBox.add(l2);
		
		City c = new City("blingbling", inhabitants, postBox);
		
		c.distributeLetter();
		
	}
}
