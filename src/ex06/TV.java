package ex06;

public class TV {
	private boolean power;
	private int volume;
	private int channel;
	
	public TV(){}
	
	public TV(int channel, int volume, boolean power){
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}
	
	public void power(boolean on) {
		this.power = on;
	}

	public void channel(int channel) {
		if(!power) {
			return;
		}
		this.channel = channel;
	}
	
	public void channel(boolean up) {
		if(!power) {
			return;
		}
		if(up == true) {
			this.channel++;
		}
		else {
			this.channel--;
		}
	}
	
	public void volume(int volume) {
		if(!power) {
			return;
		}
		this.volume = volume;
	}
	
	public void volume(boolean up) {
		if(!power) {
			return;
		}
		if(up == true) {
			this.volume++;
		}
		else {
			this.volume--;
		}
	}
	
	public void status() {
		System.out.println("[" + power + "," + volume + "," + channel + "]");
	}

	
	
}
