/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題8 閉店作業を行う
 *
 * 閉店時間となったため、閉店メッセージを表示し
 * 売上の割合を確認します。
 * 以下の実行例を参考に処理を追記、改変してください。
 * （%の表示は小数第一位切り捨てで行います。）
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * をお買いあげですね。
 * 承りました。
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り25個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り27個
 *
 * 閉店時間となりました。
 * またのお越しをお待ちしております。
 *
 * 売上の割合
 * 売上合計      \2470
 *
 * 内訳
 * シトロン      \1250・・・ 50%
 * ショコラ      \420・・・ 17%
 * ピスターシュ  \800・・・ 32%
 *
 */

package jp.co.sss.java100_questions_cac.lesson01.challenge08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {

		int citro = 30;

		int choco = 30;

		int pis = 30;

		System.out.println("たいへんお待たせしました。");
		System.out.println("【ポエール・ネルメ】");
		System.out.println("ただいまより開店です！！");

		System.out.println("\n本日のおすすめ商品です。\n");

		System.out.println("シトロン　　　\\250・・・残り" + citro + "個");
		System.out.println("ショコラ　　　\\280・・・残り" + choco + "個");
		System.out.println("ピスターシュ　\\320・・・残り" + pis + "個");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("\nそれぞれ何個ずつ買いますか？（最大30個まで）\n");
		System.out.print("シトロン      >");
		String citronBuy = br.readLine();
		double citronBuyCount = Double.parseDouble(citronBuy);

		System.out.print("ショコラ      >");
		String chocolatBuy = br.readLine();
		double chocolatBuyCount = Double.parseDouble(chocolatBuy);

		System.out.print("ピスターシュ  >");
		String pistacheBuy = br.readLine();
		double pistacheBuyCount = Double.parseDouble(pistacheBuy);

		System.out.println("\nシトロン     " + citronBuyCount + "個");
		System.out.println("ショコラ     " + chocolatBuyCount + "個");
		System.out.println("ピスターシュ " + pistacheBuyCount + "個");

		double sum1 = citronBuyCount + chocolatBuyCount + pistacheBuyCount;
		System.out.println("\n合計個数  " + sum1 + "個");

		double sum2 = (250 * citronBuyCount) + (280 * chocolatBuyCount) + (320 * pistacheBuyCount);
		int isum2 = (int) sum2;

		System.out.println("合計金額  " + isum2 + "円");

		System.out.println("\nをお買いあげですね。");
		System.out.println("承りました。");

		System.out.println("\n本日のおすすめ商品です。\n");

		int inum1 = (int) (citro - citronBuyCount);
		int inum2 = (int) (choco - chocolatBuyCount);
		int inum3 = (int) (pis - pistacheBuyCount);

		System.out.println("シトロン　　　\\250・・・残り" + inum1 + "個");
		System.out.println("ショコラ　　　\\280・・・残り" + inum2 + "個");
		System.out.println("ピスターシュ　\\320・・・残り" + inum3 + "個");

		System.out.println("\n閉店時間となりました。");
		System.out.println("またのお越しをお待ちしております。\n");

		System.out.println("売上の割合");
		System.out.println("売上合計  " + isum2 + "円");

		System.out.println("\n内訳");

		double cinum1 = (250 * citronBuyCount);
		double chnum1 = (280 * chocolatBuyCount);
		double pinum1 = (320 * pistacheBuyCount);
		//それぞれの売上の計算

		double cinum2 = (cinum1 / isum2 * 100);
		double chnum2 = (chnum1 / isum2 * 100);
		double pinum2 = (pinum1 / isum2 * 100);
		//売上に占める割合の計算

		System.out.println("シトロン　　　\\" + (int) cinum1 + "・・・" + (int) cinum2 + "%");
		System.out.println("ショコラ　　　\\" + (int) chnum1 + "・・・" + (int) chnum2 + "%");
		System.out.println("ピスターシュ　\\" + (int) pinum1 + "・・・" + (int) pinum2 + "%");
	}
}
