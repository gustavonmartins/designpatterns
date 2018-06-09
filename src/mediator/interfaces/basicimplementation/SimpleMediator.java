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
		String participantName = removeParticipant.getParticipantName();
		if(participantsList.remove(removeParticipant)) {
			System.out.format("\nParticipant %s has been removed from %s",participantName,this.name);
		}else {
			System.out.format("\nNo need to remove participant %s from %s",participantName,this.name);
		}
		
		
	}
	
	@Override
	public String getMediatorName() {return this.name;}

}
