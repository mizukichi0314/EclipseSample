
// int price = Integer.parseInt(args[0]);
		// double rate = 0.10;
		// int discount, amount;
		
		// if( price >= 3000 ) {
			// discount = 300;
		// } else {
			// discount = 0;
		// }
		
		// amount = (int)((price - discount) * (1 + rate));
		// System.out.println("値引金額：" + discount + "円");
		// System.out.println("税込金額：" + amount + "円");
public class Branch1 {

	public static void main(String[] args) {
		// 上記、サンプルコードをif~else文に書き直した場合	
		// コマンドライン引数から価格を取得
		int price = Integer.parseInt(args[0]);
		// 税率が10％
		double rate = 0.10;
		// 値引額と税込金額をint型に代入
		int discount, amount;
		// 価格が5000円以上の場合
		if( price >= 5000 ) {
			// 500円割引が適用
			discount = 500;
		// 価格が3000円以上、5000円未満の場合
		} else if ( price >= 3000 ) {
			// 300円割引が適用
			discount = 300;
		// 3000円未満の場合
		} else {
			// 割引は適用されない
			discount = 0;
			// 割引を適用し、税込金額を計算
			amount = (int)(( price - discount ) * ( 1 + rate ));
			System.out.println("値引金額：" + discount + "円");
			System.out.println("税込金額：" + amount + "円");
		}

	}

}
