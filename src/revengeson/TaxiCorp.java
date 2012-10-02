package revengeson;

import java.util.ArrayList;

/**
 * タクシー会社クラス
 * タクシー会社は一意な存在なのでSingletonで作成
 *
 */
public class TaxiCorp {
	
	// タクシー会社インスタンスを保持
	private static TaxiCorp instance = new TaxiCorp();
	
	// 配車(PickUP)回数
	private int pro = -1;
	
	// タクシードライバーインスタンスをArrayで保持する
	private ArrayList<TaxiDriver> taxiDrivers = new ArrayList<TaxiDriver>();
	
	/**
	 * タクシー会社コンストラクタ
	 * SingleTonクラスなのでprivateで宣言
	 */
	private TaxiCorp() {
		
		// ドライバーが増えた場合はここに追加していく。
		this.taxiDrivers.add(new MasterDriver());
		this.taxiDrivers.add(new PonkotsuDriver());
	}
	
	
	/**
	 *  タクシー会社へ電話連絡する
	 * @return TaxiCorpインスタンスを返却する
	 */
	public static TaxiCorp callTaxiCorp() {
		return TaxiCorp.instance;
	}

	/**
	 * タクシーを呼ぶメソッド
	 * @return TaxiDriverを返却する。
	 */
	public TaxiDriver pickUpDriver() {

		// 配車(PickUP)回数をカウントアップ
		this.pro++;
		
		// ドライバーの人数を獲得
		Integer driverNum = this.taxiDrivers.size();
		
		// どのドライバーを呼ぶか算出
		// 「配車(PickUP)回数」割る「ドライバーの人数」の余りで算出
		Integer index = this.pro % driverNum;

		return this.taxiDrivers.get(index);
	}
	
}
