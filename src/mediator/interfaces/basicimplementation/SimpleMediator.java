package mediator.interfaces.basicimplementation;

import java.util.ArrayList;

import mediator.interfaces.raw.level0.Mediator;
import mediator.interfaces.raw.level0.Participant;

public class SimpleMediator implements Mediator {
	private int highestParticipantID;
	private String name;
	private ArrayList<Participant> participantsList;
	
	public SimpleMediator(String name) {
		this.name=name;
		highestParticipantID=0;
		participantsList=new ArrayList<Participant>();
	}

	@Override
	public int register(Participant newParticipant) {
		// TODO Auto-generated method stub
		participantsList.add(newParticipant);
		highestParticipantID++;
		return highestParticipantID;
	}

	@Override
	public void unregister(Participant removeParticipant) {
		if(participantsList.remove(removeParticipant)) {
			System.out.format("Participant %s has been removed from %s\n",removeParticipant,this.name);
		}else {
			System.out.format("No need to remove participant %s from %s\n",removeParticipant,this.name);
		}
		
		
	}
	


}
