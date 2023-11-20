
public class Review01 {

	public static void main(String[] args) {

		 //税込み価格　＝　商品価格　＊　税率
		int syouhinnkakaku = 100;
		int zeiritu = tax(syouhinnkakaku,10);
		int zeikomikakaku = syouhinnkakaku + zeiritu;

	        System.out.println(syouhinnkakaku+"円の商品の税込み価格は" +zeikomikakaku +"円（消費税は" +zeiritu+"円）です。");

	}
	public static int tax(int syouhinn,int zeiritu){
		int zei = syouhinn / zeiritu;
		return zei;
	}


}
