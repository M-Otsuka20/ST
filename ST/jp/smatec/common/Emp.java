//社員1人1人を現す抽象クラス
//jp.smatec.commonパッケージに配置する。
package jp.smatec.common;

public abstract class Emp {
	//変数として氏名(String型:empName)、社員番号(String型:empID)、グループ共通ID(int型:groupID)を用意する。
	//上記変数は継承したクラスのみ直接アクセスできるようにする。
	private String First_Name;
	private String Family_Name;
	private String empName = Family_Name + First_Name;
	private String empID;
	private int groupID;

	//●コンストラクタとして1つ用意する。
	//・社員番号、氏名を引数としたコンストラクタで、
	//処理として引数の社員番号をempIDに、氏名をempNameにセットする。
	public Emp(String empID, String empName) {
		this.empID = empID;
		this.empName = empName;
	}

	//●抽象メソッドとして社員情報が格納されているかを確認するcheckEmp()を作成する。
	//返り値はなしとする。
	abstract void checkEmp();

	//●メソッドとしては以下を用意する。
	//・グループ共通IDをセットするメソッドsetGroupID()
	//グループ共通IDを引数に、groupIDに引数のグループ共通IDをセットする
	//このメソッドは継承先でのオーバーライドができないようにする。
	final public void setGroupID(int groupID) {
		this.groupID = groupID;
	}

	//・グループ共通IDを返すメソッドgetGroupID()
	//このメソッドは継承先でのオーバーライドができないようにする。
	final public int getGroupID(int groupID) {
		this.groupID = groupID;
		return groupID;
	}

	//・社員番号を返すメソッドgetEmpID()
	public String getEmpID() {
		return empID;
	}

	//・登録されている社員情報を表示するメソッドout()
	//(この処理はこちらから与えます)
	public void out() {
		System.out.println(empID + groupID + empName);
	}
}
