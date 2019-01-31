package time;

public class MainClass {

	public static void main(String[] args) {
		Time timer = new Time();
		System.out.println(timer.setMilitaryHour());
		Time timer2 = new Time(17,20,78);
		System.out.println(timer2.setMilitaryHour());
		System.out.println(timer2.setRegularHour());
		Time timer3 = new Time(0, 23, 12);
		System.out.println(timer3.setMilitaryHour());
		System.out.println(timer3.setRegularHour());
		Time timer4 = new Time(12, 15, 9);
		System.out.println(timer4.setMilitaryHour());
		System.out.println(timer4.setRegularHour());
		
		Time timer5 = new Time(23, 15);
		System.out.println(timer5.setMilitaryHour());
		System.out.println(timer5.setRegularHour());
	}

}
