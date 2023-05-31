import java.util.Scanner;

public class Binomial_Coefficient {
    public static int fact(int a){
        if (a==1){
            return 1;
        }
        else{
            return a*fact(a-1);
        }
    }
    public static int nCr(int n,int r){
        int factorial_of_n=fact(n);
        int factorial_of_r=fact(r);
        int factorial_of_nr=fact(n-r);
        int Coeff=((factorial_of_n)/(factorial_of_r*factorial_of_nr));
        return Coeff;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();
        System.out.print("Enter r: ");
        int r=sc.nextInt();
        sc.close();
        System.out.println("Value of " + n + "C" + r + " is: " + nCr(n,r));
    }
    
}
