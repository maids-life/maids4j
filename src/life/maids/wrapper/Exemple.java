package life.maids.wrapper;

import java.io.IOException;

import life.maids.wrapper.api.type.EndPoints;

public class Exemple {

	public static void main(String[] args) {
		
		try {
			String lewd = Maids.getRandomImage(EndPoints.LOCAL_LEWD);
			System.out.println(lewd);
		} catch (IOException | InterruptedException e) {
			// ignore or catch up with your own code—I don't know.
		}
		
	}
	
}