package src;
import java.util.*;

public class A_wwwvvvvvv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        scanner.close();

        String ans = "";

        char [] alphabet = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};

        for (int i = 0; i < K; i++) {
            ans += alphabet[i];
        }
        
        System.out.println(ans);
    }
}