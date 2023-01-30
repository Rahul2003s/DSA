import java.util.*;
public class bmaths {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to count digit:");
        int n = sc.nextInt();
        System.out.println(count_digits(n));
        // System.out.println("\n"+n);
        sc.close();
    }

    public static int count_digits(int N) {
        int c=0,t,nc=N;
        while(N>0){
            t=N%10;
            N=N/10;
            if(t!=0){
                if(nc%t==0){
                    c++;
                }
            }
            
        }
        return c;
    }

    public static Long reverse_number_bin(int n) {
        // Integer.parseInt((Integer.toBinaryString(10)),2)
    }
}
