package revengeson;

/**
 * 人間クラス
 * 
 */
public class Person {
	
	// 名前
	private String name;
	
	/**
	 * コンストラクタ
	 * @param name 人間の名前
	 */
	public Person(String name) {
		this.name = name;
	}
	
	/**
	 * 人間の名前を取得する
	 * @return
	 */
	public String getName() {
		return this.name;
	}
}
