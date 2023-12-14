//Review03 という名前のクラス（メインメソッドあり）を作成。
//メインメソッドの中で BaseBallTeam のインスタンスを6個生成し、それぞれのチームの名前、勝ち数、負け数、引き分け数を格納。
//report メソッドを呼び出して、勝敗情報を表示する。
//記述例：東京ヤクルトスワローズ の2022年の成績は 80勝 59敗 4分、勝率は 0.5755395683453237です。

package baseball;

public class Review03 {

    public static void main(String[] args) {
        BaseBallTeam team01 = new BaseBallTeam("東京ヤクルトスワローズ", 80, 59, 4);
        team01.report();

        BaseBallTeam team02 = new BaseBallTeam("横浜DeNAベイスターズ", 73, 68, 2);
        team02.report();

        BaseBallTeam team03 = new BaseBallTeam("阪神タイガース", 68, 71, 4);
        team03.report();

        BaseBallTeam team04 = new BaseBallTeam("読売ジャイアンツ", 68, 72, 3);
        team04.report();

        BaseBallTeam team05 = new BaseBallTeam("広島東洋カープ", 66, 74, 3);
        team05.report();

        BaseBallTeam team06 = new BaseBallTeam("中日ドラゴンズ", 66, 75, 2);
        team06.report();
    }
}
