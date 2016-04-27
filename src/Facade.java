
public class Facade {
	
	Amplifier amplifier;
	Tuner tuner;
	CdPlayer cdPlayer;
	DvdPlayer dvdPlayer;
	Projector projector;
	Lights lights;
	
	public Facade() {
		// TODO Auto-generated constructor stub
		amplifier = new Amplifier(tuner, cdPlayer, dvdPlayer);
		tuner = new Tuner();
		cdPlayer = new CdPlayer();
		dvdPlayer = new DvdPlayer();
		projector = new Projector();
		lights = new Lights();
	}
	
	

}
