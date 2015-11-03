package city.letter;

import city.inhabitant.Inhabitant;
import city.letter.content.Text;

public class SimpleLetter extends Letter<Text>{

	protected String content;
	
	public SimpleLetter(Inhabitant sender, Inhabitant receiver, String content, double cost) {
		super(sender, receiver, new Text(content), cost);
		this.content = content;
	}
	
	@Override
	public void action() {
		if (!isSend()){
			System.out.println("-> "+sender.getName()+" mails a simple letter whose content " +
					"is a text content ("+content+") to "+receiver.getName()+" for a cost of "+cost+" euro(s)");
			sender.debit(cost);
			System.out.println("   - "+cost+" euro(s) are debited from "+sender.getName()+" account whose balance is now "+sender.getBankAccount()+" euro(s)");
			send = true;
		}
		else{
			System.out.println("<- "+receiver.getName()+" receives a simple letter whose content " +
					"is a text content ("+content+") from "+sender.getName());			
			received = true;
		}
		
	}

}
