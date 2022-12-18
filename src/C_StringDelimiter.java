package src;
import java.util.*;

public class C_LadderTakahashi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        String S = scanner.next();
        scanner.close();
        char[] s = S.toCharArray();

        int delimiterCounter = 0;
        for (int i = 0; i < N; i++) {
            if (s[i] == '"') {
                delimiterCounter++;
            }
            if (s[i] == ',') {
                if(delimiterCounter%2 == 0) {
                    s[i] = '.';
                }
            }
        }

        String ans = new String(s);
        System.out.println(ans);
    }    
}