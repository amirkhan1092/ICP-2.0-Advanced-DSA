import java.util.*;
import java.io.*;

public class SoldierandBananas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();   // cost of banana
        int n = sc.nextInt();  // n dollar amount 
        int w = sc.nextInt();  // number of banana need to purchase
        int cost = 0;
        for (int i = 1; i <= w; i++) {
            cost += i*k;
        }

        System.out.println(cost - n > 0 ? cost-n:0);
        sc.close();
    }
}
