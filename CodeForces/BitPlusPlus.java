import java.util.Scanner;

public class BitPlusPlus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int value = 0;

        for(int i=0; i<N; i++){
            String st = sc.next();
            if(st.charAt(0) == '+' || st.charAt(2) == '+'){
                value++;
            }
            else 
                value--;
        }

        System.out.println(value);

        sc.close();
    }
}
