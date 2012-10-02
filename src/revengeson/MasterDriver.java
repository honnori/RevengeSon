package revengeson;

/**
 * 熟練ドライバークラス
 *
 */
public class MasterDriver extends TaxiDriver {

	@Override
	protected void startEngine() {
	}

	@Override
	protected void checkAround() {
		System.out.println("バックミラーOK");
		System.out.println("シートベルトOK");
		System.out.println("前方OK");
		System.out.println("後方OK");
		System.out.println("前方OK");
	}

	@Override
	protected void kickAccel() {
		System.out.println("慎重にしよう");
	}

}
