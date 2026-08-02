import java.util.Scanner;

public class StonesOntheTable {
    public static void main(String[] args) {
        // n
        // RGBBGR....n

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int ans=0;
        for (int i = 0; i < n-1; i++) {

            char current = s.charAt(i);
            char next = s.charAt(i+1);

            if(current == next){
                ans++;
            }
            
        }
        System.out.println(ans);

        sc.close();


    }
}
