package gameProject.concretes;

import gameProject.abstracts.GamerCheckService;
import gameProject.abstracts.GamerService;
import gameProject.entities.Gamer;

public class GamerManager implements GamerService {
	
	private GamerCheckService gamerCheckService;
	
	public GamerManager(GamerCheckService gamerCheckService) {
		this.gamerCheckService = gamerCheckService;
	}

	@Override
	public void add(Gamer gamer) {
		
		if(gamerCheckService.checkIfRealPerson(gamer)) {
			System.out.println("Oyuncu eklendi. " + gamer.getFirstName());
		} else {
			System.out.println("Do�ru bilgi giriniz.");
		}
		
	}

	@Override
	public void delete(Gamer gamer) {
		
		System.out.println("Oyuncu silindi. " + gamer.getFirstName());
	}

	@Override
	public void update(Gamer gamer) {
		
		System.out.println("Oyuncu g�ncellendi. " + gamer.getFirstName());
	}

	
}
