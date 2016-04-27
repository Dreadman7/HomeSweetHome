
public class Facade implements Device {
	
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

	@Override
	public void on() {
		// TODO Auto-generated method stub
		amplifier.on();
		projector.on();
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		amplifier.off();
		projector.off();
		
	}
	
	
	

}
