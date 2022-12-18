package src;
import java.util.*;

public class B_LOOKUP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int ansScore = 0;

        String S[] = new String[N];
        char ans[][] = new char[N][M];
        for (int i = 0; i < N; i++) {
            S[i] = scanner.next();
            char[] s = S[i].toCharArray();
            for (int j = 0; j < M; j++) {
                ans[i][j] = s[j];
            }
        }
        scanner.close();

        for (int i = 0; i < N; i++) {
            for (int j = i+1; j < N; j++) {
                int [] score = new int[M];
                for (int k = 0; k < M; k++) {
                    if (ans[i][k] == 'o') {
                        score[k] = 1;
                    }
                    if (ans[j][k] == 'o') {
                        score[k] = 1;
                    }
                }
                for (int k = 0; k < M; k++) {
                    if (score[k] != 1) {
                        break;
                    }
                    if (k == M-1) {
                        ansScore++;
                    }
                }
            }
        }
        System.out.println(ansScore);
    }
}