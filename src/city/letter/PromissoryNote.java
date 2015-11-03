package city.letter;

import city.inhabitant.Inhabitant;
import city.letter.content.Change;
import city.letter.content.Text;

public class PromissoryNote extends Letter<Change>{
	
	protected String content;
	
	public PromissoryNote(Inhabitant sender, Inhabitant receiver, String content, double cost) {
		super(sender, receiver, new Change(content), cost);
		this.content = content;
	}
	
	@Override
	public void action() {
		if (!isSend()){
			System.out.println("-> "+sender.getName()+" mails a promissory note letter whose content " +
					"is a money content ("+content+") to "+receiver.getName()+" for a cost of "+cost+" euro(s)");
			sender.debit(cost);
			System.out.println("   - "+cost+" euro(s) are debited from "+sender.getName()+" account whose balance is now "+sender.getBankAccount()+" euro(s)");
			send = true;
		}
		else{
			System.out.println("<- "+receiver.getName()+" receives a promissory note letter whose content " +
					"is a money content ("+content+") from "+sender.getName());
			sender.debit(Double.parseDouble(content));
			System.out.println("   - "+content+" euro(s) are debited from "+sender.getName()+" account whose balance is now "+sender.getBankAccount()+" euro(s)");
			receiver.credit(Double.parseDouble(content));
			System.out.println("   + "+receiver.getName()+" account is credited with "+content+" euro(s); its balance is now "+receiver.getBankAccount()+" euro(s)");
			// TODO thanks letter
			received = true;
		}
		
	}

}
