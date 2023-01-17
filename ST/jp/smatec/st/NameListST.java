//jp.smatec.stパッケージに配置する。
package jp.smatec.st;

import java.util.ArrayList;

import jp.smatec.common.NameList;

//　・NameListからの継承で、publicメソッドとしてgroupIDをキーにして社員情報を表示するgetEmpInfo()。
//　　EmpSTのout()(後述)を使って該当する社員情報を出力する。
//　　(この処理はこちらから与えます)
//　・publicメソッドとしてempIDをキーにして社員情報を表示するgetEmpInfo()。
//　　Empのout()を使って該当する社員情報を出力する。
//　　(この処理はこちらから与えます)
//　・publicメソッドとして会社名と社員情報をすべて画面に表示するout()。
//　　(この処理はこちらから与えます)

//STの社員名簿を現したクラスで、NameListクラスから継承
public class NameListST extends NameList {

	@Override
	public void getEmpInfo(int groupID) {
		// TODO 自動生成されたメソッド・スタブ

	}

	//変数として、社員情報のリストを用意する。(この変数はこちらから与えます)
	ArrayList<> NameListST;

	//コンストラクタとして、会社名を引数としたコンストラクタを1つ作る。
	//処理としては引数をスーパークラスに渡すのと、社員情報のリストを初期化する。
	//(社員情報リストの初期化はこちらから与えます)
	public NameListST(String companyName) {
		super(companyName);
		NameListST = new ArrayList<String>();
	}

	//●メソッドとしては以下を用意する。
	//・publicメソッドとして社員情報を追加するsetEmpList()。
	//(この処理はこちらから与えますが、不足しているところを追加してください)
	public void setEmpList() {
		NameListST.add(emp);

	}

}
