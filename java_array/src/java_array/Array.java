package java_array;

public class Array {

	public static void main(String[] args) {
		//new intで３つの整数を入れらえる配列scoreを作っている
		int [] score = new int[3];
		//80をscore[0]に代入
		score[0] = 80;
		//100をscore[1]に代入
		score[1] = 100;
		//75をscore[2]に代入
		score[2] = 75;
		//String型を初期化し、それぞれ3人の名前を代入
		String[] name = { "菅原", "村山", "寺島" };
		//それぞれの名前と点数を表示
		System.out.println( name[0] + "さん：" + score[0] + "点" );
		System.out.println( name[1] + "さん：" + score[1] + "点" );
		System.out.println( name[2] + "さん：" + score[2] + "点" );
		//score.lengthで配列scoreの要素数である３を取得（9、11、13行目）
		System.out.println( "受験者数：" + score.length + "名" );

	}

}
