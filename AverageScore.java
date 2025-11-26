import java.util.*;

/**
 * AverageScore
 * 複数の点数の平均値を計算し、70点以上なら "Pass"、
 * それ以外は "Fail" と表示するプログラム。
 */
public class AverageScore {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();              // 入力される点数の個数
        int[] scores = new int[n];

        int sum = 0;                       // 合計値
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();      // 点数入力
            sum += scores[i];              // 合計に追加
        }

        double avg = (double) sum / n;     // 平均値
        System.out.printf("Average: %.2f\n", avg);

        // 平均が70以上なら合格
        if (avg >= 70) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}
