package revengeson;

/**
 * 我が人生クラス
 * @author take
 *
 */
public class MyLife {
	
	public static void main(String[] args) {
		
		TaxiDriver driver = null;
		Person person = new Person("俺様");
		
		// タクシー呼び出し回数を設定
		// 今回は2回呼ぶので2を設定
		Integer callNumber = 2;
		
		// タクシー呼び出し回数分ループ
		for (int i = 0; i < callNumber; i++) {
			// タクシー会社からタクシードライバーを呼ぶ
			driver = TaxiCorp.callTaxiCorp().pickUpDriver();
			
			// ドライバーが客を乗せる
			driver.ride(person);
			
			// 発進する。
			driver.startDrive();
			
			// とりあえず3色全部取出して全色分、handlingしてみる。
			TrafficSignal[] signalList = TrafficSignal.values();
			for (TrafficSignal signal : signalList) {
				// 問3　信号を見てドライバーがハンドル操作する。
				driver.handling(signal);
			}
			System.out.println("----------------------------");
		}
	}

}
