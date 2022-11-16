package study.thursday.week1.YunByungil;
import java.util.Scanner;

public class No25305 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int students = scanner.nextInt();
        int cutLine = scanner.nextInt();
        int temp = 0;

        int[] score = new int[students];

        for (int i = 0; i < score.length; i++) {
            score[i] = scanner.nextInt();
        }

        for (int i = 0; i < score.length - 1; i++) {
            for (int j = i + 1; j < score.length; j++) {
                if (score[i] < score[j]) {
                    temp = score[j];
                    score[j] = score[i];
                    score[i] = temp;
                }
            }
        }
        System.out.println(score[cutLine - 1]);
    }
}
