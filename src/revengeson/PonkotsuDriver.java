package revengeson;

public class PonkotsuDriver extends TaxiDriver {

	@Override
	protected void startEngine() {
	}

	@Override
	protected void checkAround() {
		System.out.println("前方OK、発進だ");
		System.out.println("おっとシートベルト忘れてた");
	}

	@Override
	protected void kickAccel() {
		System.out.println("いけいけどんどん!");
	}

	@Override
	protected void handling(TrafficSignal signal) {
		
		if (signal == TrafficSignal.YELLOW){
			System.out.println("黄色だ!  いける、加速しよう。");
		}
		else {
			// 黄色以外の場合、親のhandlingで処理してもらう
			super.handling(signal);
		}
	}
	
	

}
