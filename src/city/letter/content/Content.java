package city.letter.content;

public abstract class Content {

	protected String value;
	
	public Content(String value){
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
