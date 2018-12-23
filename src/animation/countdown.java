package animation;

import java.util.Timer;
import java.util.TimerTask;



public class countdown {


	public int timer;

	public void counter(int zaehler) {

		timer = zaehler;

		Timer mytimer = new Timer();

		TimerTask task = new TimerTask() {

			@Override
			public void run() {
				if (timer >= 0) {
					System.out.println(timer);
					timer --;
				}
				if (timer == -1) {
					mytimer.cancel();

				}
			}
		};
		mytimer.schedule(task, 0, 1000);
	}	

	public int getTimer() {
		return timer;
	}
	public void setTimer(int timer) {
		this.timer = timer;
	}
}
