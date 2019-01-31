package time;

public class Time {
	int hour;
	int minutes;
	int seconds;
	
	
	
	public Time() {
		this (0,0,0);
	}
	
	public Time(int h) {
		this (h,0,0);
	}
	
	public Time(int h, int m) {
		this (h,m,0);
	}
	
	public Time(int h,int m,int s) {
		setHour(h);
		setMinutes(m);
		setSeconds(s);
	}

	
	public void setHour(int hour) {
		this.hour =((hour >= 0 && hour < 24)? hour:0);
		
	}
	
	public void setMinutes(int minutes) {
		this.minutes = ((minutes >= 0 && minutes < 60)? minutes:0);
	}
	
	public void setSeconds(int seconds) {
		this.seconds =((seconds >= 0 && seconds < 60)? seconds:0);
	}
	
	public int getHour() {
		return hour;
	}
	
	public int getMinutes() {
		return minutes;
	}
	
	public int getSeconds() {
		return seconds;
	}

	
	public String setMilitaryHour() {
		return String.format("%02d:%02d:%02d", getHour(),getMinutes(),getSeconds());
	}
	
	public String setRegularHour() {
		return (String.format("%02d:%02d:%02d %s", (hour == 0 || hour == 12)?12:hour%12,minutes,seconds, (hour < 12)?"AM":"PM"));
	}
	

}
