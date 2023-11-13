
// 課題
/*
public class Test {
 public static void main(String[] args) {
  int iNum = 5;
  float fNum = 3.4f;
  double dNum = 7.9;
  if (iNum > 5) {
   iNum = fNum; // line 1 
  } else {
   fNum = dNum; // line 2 
  } 
 } 
}
*/

// 上記のコードをコンパイル、または実行を行うとline1,line2どちらもコンパイルエラーが発生する（回答３）
// float型からint型、double型からfloat型のように、大きい数字から小さい数字に変換することはできない
// 以下、コードのようにキャストを行うことによって、コンパイルエラーすることなく、line1,line2どちらも実行することができる

package java_data;

public class Data {

	public static void main(String[] args) {
		
		int iNum = 5;
		float fNum = 3.4f;
		double dNum = 7.9;
		
		if ( iNum > 5 ) {
			 
			iNum = (int)fNum; //line1
			
		} else {
			
			fNum = (float)dNum; //line2
			
		}
		
	}

}
