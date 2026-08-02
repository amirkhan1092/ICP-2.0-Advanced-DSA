import java.util.*;

public class NearlyLuckyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long number = sc.nextLong();
        String ans = "YES";

        while(number != 0){
            if(number % 10 != 4 || number % 10 != 7){
                ans = "NO";
                break;
            }
            number = (long)number / 10;
        }
        System.out.println(ans);
        
    }
}
