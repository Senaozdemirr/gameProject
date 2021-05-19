package gameProject.adapters;

import gameProject.abstracts.GamerCheckService;
import gameProject.entities.Gamer;

public class MernisServiceAdapter implements GamerCheckService{

	@Override
	public boolean checkIfRealPerson(Gamer gamer) {
		System.out.println(gamer.getFirstName() + "Do�ruland�.");
		return false;
	}

	
}
