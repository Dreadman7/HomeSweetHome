
public class Amplifier extends Tuner implements Device{
		
	Tuner tuner;
	CdPlayer cdPlayer;
	DvdPlayer dvdPlayer;
	
	public Amplifier(Tuner tuner, CdPlayer cdplayer, DvdPlayer dvdplayer) {
		// TODO Auto-generated constructor stub
		this.tuner = tuner;
		this.cdPlayer = cdplayer;
		this.dvdPlayer = dvdplayer;
	}
	
	

	@Override
	public void on() {
		// TODO Auto-generated method stub
		tuner.on();
		cdPlayer.on();
		dvdPlayer.on();
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		tuner.off();
		cdPlayer.off();
		dvdPlayer.off();
	}
	
	public void setStereoSound(){
		
	}
	
	public void setVolume(int level){
		
	}
	
	
}
