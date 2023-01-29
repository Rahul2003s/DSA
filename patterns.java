import java.util.*;

public class patterns{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int c;
        loop : while(true){
            System.out.println("patterns");
            System.out.println("1.pattern1");
            System.out.println("2.pattern2");
            System.out.println("3.pattern3");
            System.out.println("4.pattern4");
            System.out.println("5.pattern5");
            System.out.println("6.pattern6");
            System.out.println("7.pattern7");
            System.out.println("8.pattern8");
            System.out.println("9.pattern9");
            System.out.println("91.pattern91");
            System.out.println("10.pattern10");
            System.out.println("11.pattern11");
            System.out.println("12.pattern12");
            System.out.println("13.pattern13");
            System.out.println("14.pattern14");
            System.out.println("15.pattern15");
            System.out.println("16.pattern16");
            System.out.println("17.pattern17");
            System.out.println("23.exit");

            c=sc.nextInt();
            switch (c) {
                case 1:
                    System.out.print("Enter the Value:");
                    int p=sc.nextInt();
                    pattern1(p);
                    break;
                case 2:
                    System.out.print("Enter the Value:");
                    int p1=sc.nextInt();
                    pattern2(p1);
                    break;
                case 3:
                    System.out.print("Enter the Value:");
                    int p2=sc.nextInt();
                    pattern3(p2);
                    break;
                case 4:
                    System.out.print("Enter the Value:");
                    int p3=sc.nextInt();
                    pattern4(p3);
                    break;
                case 5:
                    System.out.print("Enter the Value:");
                    int p4=sc.nextInt();
                    pattern5(p4);
                    break;
                case 6:
                    System.out.print("Enter the Value:");
                    int p5=sc.nextInt();
                    pattern6(p5);
                    break;        
                case 7:
                    System.out.print("Enter the Value:");
                    int p6=sc.nextInt();
                    pattern7(p6);
                    break;
                case 8:
                    System.out.print("Enter the Value:");
                    int p7=sc.nextInt();
                    pattern8(p7);
                    break;
                case 9:
                    System.out.print("Enter the Value:");
                    int p8=sc.nextInt();
                    pattern9(p8);
                    break;
                case 91:
                    System.out.print("Enter the Value:");
                    int p9=sc.nextInt();
                    printDiamond(p9);
                    break; 
                case 10:
                    System.out.print("Enter the Value:");
                    int p10=sc.nextInt();
                    pattern10(p10);
                    break;
                case 11:
                    System.out.print("Enter the Value:");
                    int p11=sc.nextInt();
                    pattern11(p11);
                    break;
                case 12:
                    System.out.print("Enter the Value:");
                    int p12=sc.nextInt();
                    pattern12(p12);
                    break;
                case 13:
                    System.out.print("Enter the Value:");
                    int p13=sc.nextInt();
                    pattern13(p13);
                    break;
                case 14:
                    System.out.print("Enter the Value:");
                    int p14=sc.nextInt();
                    pattern14(p14);
                    break;
                case 15:
                    System.out.print("Enter the Value:");
                    int p15=sc.nextInt();
                    pattern15(p15);
                    break;
                case 16:
                    System.out.print("Enter the Value:");
                    int p16=sc.nextInt();
                    pattern16(p16);
                    break;
                case 17:
                    System.out.print("Enter the Value:");
                    int p17=sc.nextInt();
                    pattern17(p17);
                    break;
               case 23:
                    sc.close();
                    break loop;
                default:
                    break;
            }
        }
        
    }

    public static void pattern1(int n){
        System.out.println("\n\npattern 1 ");
        for(int i=0; i<n ;i++){
            for(int j=0; j<n ;j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        System.out.print("\n\n");
    }
    public static void pattern2(int n){
        System.out.println("\n\npattern 2 ");
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        System.out.print("\n\n");
    }
    public static void pattern3(int n){
        System.out.println("\n\npattern 3 ");
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(j+1+" ");
            }
            System.out.print("\n");
        }
        System.out.print("\n\n");
    }
    public static void pattern4(int n){
        System.out.println("\n\npattern 4 ");
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(i+1);
            }
            System.out.print("\n");
        }
        System.out.print("\n\n");
    }
    public static void pattern5(int n){
        System.out.println("\n\npattern 5 ");
        for(int i=0;i<n;i++){
            for(int j=0;j<(n-i);j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.print("\n\n");
    }
    public static void pattern6(int n){
        System.out.println("\n\npattern 6 ");
        for(int i=0;i<n;i++){
            for(int j=0;j<(n-i);j++){
                System.out.print(j+1+" ");
            }
            System.out.print("\n");
        }
        System.out.print("\n\n");
    }
    public static void pattern7(int n){
        System.out.println("\n\npattern 7 ");
        for(int i=0;i<n;i++){
            for(int j=0;j<(n-i-1);j++){
                System.out.print(" ");
            }
            for(int k=0;k<((2*i)+1);k++){
                System.out.print("*");
            }
            for(int j=0;j<(n-i-1);j++){
                System.out.print(" ");
            }
            System.out.print("\n");
        }
        System.out.print("\n\n");
    }
    public static void pattern8(int n) {
        System.out.println("\n\npattern 8 ");

        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(" ");
            }
            for (int j = 0; j<=(((n*2)-2)-i*2); j++) {
                System.out.print("*");    
            }
            System.out.print("\n");
        }
        System.out.print("\n\n");
    }
    public static void pattern9(int n) {
        System.out.println("\n\npattern 9 ");
        for(int i=0;i<n;i++){
            for(int j=0;j<(n-i-1);j++){
                System.out.print(" ");
            }
            for(int k=0;k<((2*i)+1);k++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for(int i=0;i<n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for (int j = 0; j<=(((n*2)-2)-i*2); j++) {
                System.out.print("*");    
            }
            System.out.print("\n");
        }
        System.out.print("\n\n");
    }
    public static void printDiamond(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<(n-i-1);j++){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        for(int i=0;i<n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for (int j = 0; j<n-i; j++) {
                System.out.print("* ");    
            }
            System.out.print("\n");
        }
    }
    public static void pattern10(int n) {
        System.out.println("\n\npattern 10 ");        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j <(n-1)-i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    public static void pattern11(int n) {
        System.out.println("pattern 11:");
        int s=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                s=1;
            }else{
                s=0;   
            }
            for(int j=0;j<=i;j++){
                System.out.print(s+" ");
                s=1-s;
            }
            System.out.print("\n");
        }
        System.out.print("\n\n");
    }
    public static void pattern12(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(j+1+" ");
            }
            for (int j = 0; j < (n*3+1)-(4*i); j++) {
                System.out.print(" ");
            }
            for (int j = i+1; j>0; j--) {
                System.out.print(j+" ");
            }
            System.out.print("\n");
        }
    }
    public static void pattern13(int n) {
        int c=1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print(c+" ");
                c++;
            }
            System.out.println("");
        }
    }
    public static void pattern14(int n) {
        int c;
        for (int i = 0; i < n; i++) {
            c=65;
            for (int j = 0; j <=i; j++) {
                System.out.print((char)c);
                c++;
            }
            System.out.println("");
        }
        
    }
    public static void pattern15(int n) {
        int c;
        for (int i = 0; i < n; i++) {
            c=65;
            for(int j=0;j<(n-i);j++){
                System.out.print((char)c);
                c++;
            }
            System.out.println("");
            
        }
    }
    public static void pattern16(int n) {
        int c=65;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print((char)c);
            }
            c++;
            System.out.println("");
        }
        
    }
    public static void pattern17(int n) {
        int c,a,cn;
        for (int i = 0; i <n; i++) {
            c=65;
            for (int j = 0; j < (n-1)-i; j++) {
                System.out.print(" ");
            }
            cn=0;
            for (int j = 0; j < ((2*i)+1); j++) {
                a=(2*i)/2+1;                
                System.out.print((char)c);
                cn++;
                if(cn<a){
                    c++;
                }else{
                    c--;
                }
            }
            System.out.println("");
        }        
    }
}
