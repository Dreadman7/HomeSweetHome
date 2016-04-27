
public class Amplifier extends Tuner implements Device{
		
	Tuner tuner;
	CdPlayer cdPlayer;
	DvdPlayer dvdPlayer;
	
	public Amplifier(Tuner tuner, CdPlayer cdplayer, DvdPlayer dvdplayer) {
		// TODO Auto-generated constructor stub
		this.tuner = new Tuner();
		this.cdPlayer = new CdPlayer();
		this.dvdPlayer = new DvdPlayer();
	}

	@Override
	public void on() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		
	}
	
	public void setStereoSound(){
		
	}
	
	public void setVolume(int level){
		
	}
	
	
}
