import java.util.Scanner;

public class BeautifulMatrix {
    public static void main(String[] args) {
        // Matrix is Beautiful is 1 is at middle M(3, 3) == 1

        Scanner sc = new Scanner(System.in);
        int row=0;
        int col=0;
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                if(sc.nextInt() == 1){
                    row = i;
                    col = j;
                }
            }
        }

        int ans = Math.abs(row - 2)  + Math.abs(col - 2);
        System.out.println(ans);
        sc.close();
    }
}
