import java.util.Scanner;
class Exercice5 {
    
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Veuillez saisir un nombre entier positif:");
            int n = sc.nextInt();
        
        if (n==0) {
            System.out.println("La factorielle de " + n + " est 1.");
        } else {
            int x = 0
            while (n>0) {
                x=n*(n-1);
                n=(n-1);
            }
            System.out.println(x);
        }
    }
}