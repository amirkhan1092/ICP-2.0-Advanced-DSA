// package CodeForces;

import java.util.Scanner;

public class NextRound800 {
    public static void main(String[] args) { // NextRound800.java
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int counter=0;
        int [] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }

        K = arr[K-1];
        for(int val : arr){
            if(val >= K && val != 0) counter++;
        }

        sc.close();

        System.out.println(counter);
    }
}
