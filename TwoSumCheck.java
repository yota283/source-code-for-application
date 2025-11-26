import java.util.*;

/**
 * TwoSumCheck
 * 配列内の2つの数値の和が target になる組み合わせが存在するか判定するプログラム。
 * 計算量 O(n) のハッシュセットを用いた探索アルゴリズム。
 */
public class TwoSumCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 配列の要素数 N と、比較対象の target を入力
        int n = sc.nextInt();
        int target = sc.nextInt();

        int[] arr = new int[n];

        // 配列の読み込み
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 2つの数の和が target になるか判定
        boolean result = existsTwoSum(arr, target);

        System.out.println(result ? "Yes" : "No");
    }

    /**
     * existsTwoSum
     * ハッシュセットを使って「target - x」が既に出たかどうかを確認する。
     * 見つかれば true を返す。
     */
    private static boolean existsTwoSum(int[] arr, int target) {
        Set<Integer> seen = new HashSet<>();

        for (int x : arr) {
            int need = target - x; // もう一方に必要な値
            if (seen.contains(need)) return true; // 見つかったら終了
            seen.add(x); // 現在の値を記録
        }
        return false;
    }
}
