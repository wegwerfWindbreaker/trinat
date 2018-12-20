package animation;

import java.util.Timer;
import java.util.TimerTask;

import javafx.scene.control.Label;



public class countdown {

	
	public int timer;

	public void counter(int zaehler) {
	
		timer = zaehler;

		Timer mytimer = new Timer();

		TimerTask task = new TimerTask() {

			@Override
			public void run() {
				if (timer >= 0) {
					System.out.print(timer);
//					zeit.setText(Integer.toString(timer));
					setTimer(getTimer()-1);
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
