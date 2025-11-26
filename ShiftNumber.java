import java.util.*;

/**
 * ShiftNumber
 * 文字列で表された数字を右方向へ k 回シフトするプログラム。
 * 例：123 を 1 回シフト → 312
 */
public class ShiftNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 数字文字列とシフト回数を入力
        String s = sc.next();
        int k = sc.nextInt();

        // 右へ k 回シフト
        for (int i = 0; i < k; i++) {
            s = shiftRight(s);
        }

        System.out.println(s);
    }

    /**
     * shiftRight
     * 文字列を右に1文字分シフトする。
     * 例：123 → 312
     */
    private static String shiftRight(String s) {
        char last = s.charAt(s.length() - 1);  // 最後の1文字
        return last + s.substring(0, s.length() - 1);
    }
}
