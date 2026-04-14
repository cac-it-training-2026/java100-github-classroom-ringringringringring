/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題7 10分割して販売する
 *
 * マカロンが大きすぎて売上が芳しくないので
 * 1個のマカロンを10分割して0.1個から販売することにします。
 * (値段も0.1倍～)
 * ただし合計金額と在庫は小数を切り捨て、
 * 常に整数で表示します。
 *
 * 問題6の答えを改変し、以下の実行例を参考に処理を記述してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >5
 * ショコラ      >1.5
 * ピスターシュ  >2.5
 *
 * シトロン     5.0個
 * ショコラ     1.5個
 * ピスターシュ 2.5個
 *
 * 合計個数    9.0個
 * 合計金額   2470円
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
 */

package jp.co.sss.java100_questions_cac.lesson01.challenge07;

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
		//小数点以下消したい

		System.out.println("合計金額  " + isum2 + "円");

		System.out.println("\nをお買いあげですね。");
		System.out.println("承りました。");

		System.out.println("\n本日のおすすめ商品です。\n");

		int inum1 = (int) (citro - citronBuyCount);
		int inum2 = (int) (choco - chocolatBuyCount);
		int inum3 = (int) (pis - pistacheBuyCount);
		//少数を整数に直しちゃうんだからね！

		System.out.println("シトロン　　　\\250・・・残り" + inum1 + "個");
		System.out.println("ショコラ　　　\\280・・・残り" + inum2 + "個");
		System.out.println("ピスターシュ　\\320・・・残り" + inum3 + "個");

	}

}
