
public class Test_Branch1 {

	public static void main(String[] args) {
		// sampleコード
		int price = Integer.parseInt(args[0]);
		// 消費税率：10％
		double rate = 0.10;
		int discount, amount;
		
		// 価格が3000円以上なら、
		if( price >= 3000 ) {
			// 値引き額の設定、300円割引
			discount = 300;
		//3000以下の場合	
		} else {
			//値引き額は０円
			discount = 0;
			
			amount = (int) ((price - discount) * (1 + rate));
			System.out.println("値引き金額：" + discount + "円");
			System.out.println("税込金額：" + amount + "円");
			
			// if~elseに書き換えたコード
			//価格が5000円以上なら、
			if( price >= 5000) {
				// 500円割引
				discount = 500;
			// もし、3000円以上、5000以下なら
			} else if ( price >= 3000) {
				// 300円割引
				discount = 300;			
			// それ以外の場合
			} else {
				discount = 0;
				
				System.out.println();
				
				
			}
			
		}

	}

}
