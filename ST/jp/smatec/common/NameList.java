//社員名簿を現す抽象クラス
//●jp.smatec.commonパッケージに配置する。
package jp.smatec.common;

public abstract class NameList {

	//●変数として会社名(String型:companyName)とグループ共通ID(int型:groupID)を用意する。
	//　上記変数は他のクラスからの直接アクセスができないようにする。
	//　groupIDはstaticとし、初期値0をセットする。
	private String companyName;
	private static int groupID = 0;

	//●コンストラクタとして、会社名を引数としたコンストラクタを1つ作る。
	//コンストラクタには引数の会社名をcompanyNameにセットする。
	public NameList(String companyName) {
		this.companyName = companyName;
	}

	//●メソッドとしては以下を用意する。
	//・publicなstaticメソッドとしてグループ共通IDを払い出すgetGroupID()メソッドを作成する。
	//処理としてはgroupIDに1を加え、その値を返す。
	public static int getGroupID(int groupID) {
		groupID += 1;
		return groupID;
	}

	//・publicなメソッドとして設定された会社名を返すgetCompanyName()を作成する。
	public String getCompanyName(String companyName) {
		return companyName;
	}

	//・publicな抽象メソッドとして、gruopIDを引数とし、社員情報を表示することを想定したgetEmpInfo()を作成する。
	//返り値はなしとする。
	public abstract void getEmpInfo(int groupID);
}
