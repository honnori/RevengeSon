package revengeson;

public abstract class TaxiDriver {

	protected abstract void kickAccel();
	protected abstract void checkAround();
	protected abstract void startEngine();

	public void startDrive() {

		// １）エンジンをかける(startEngine)
		this.startEngine();
		
		// ２）周囲確認をする(checkAround)
		this.checkAround();
		
		// ３）アクセルを踏む(kickAccel)
		this.kickAccel();

	}
	
	/**
	 * お客さんを載せます
	 * @param person お客様インスタンス（人間クラス）
	 */
	public void ride(Person person) {
		System.out.println(person.getName() + "さん乗車しました");
	}
	
	
	/**
	 * 信号を見て車を操作します。
	 * @param signal 信号の色
	 */
	protected void handling(TrafficSignal signal) {
		
		if (signal == TrafficSignal.RED) {
			System.out.println("赤信号だ止まろう");
		}
		else if (signal == TrafficSignal.YELLOW){
			System.out.println("黄色だから危ないから、止まろう");
		}
		else if (signal == TrafficSignal.BLUE){
			System.out.println("青だ、よし発進しよう。");
		}
	}

}
