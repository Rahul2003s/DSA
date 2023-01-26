import java.util.*;
public class patterns{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int c;
        loop : while(true){
            System.out.println("Patters");
            System.out.println("1.patter1");
            System.out.println("2.patter2");
            System.out.println("3.patter3");
            System.out.println("4.patter4");
            System.out.println("5.patter5");
            System.out.println("6.patter6");
            System.out.println("7.patter7");
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
}