package CodeForces;

import java.util.Scanner;

public class NextRound800 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int counter=0;
        for(int i=0; i<N; i++){
            if(sc.nextInt() > K) counter++;
        }
        sc.close();

        System.out.println(counter);
    }
}
