import java.util.Scanner;
class Exercice5 {
    
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Veuillez saisir un nombre entier positif:");
            int n = sc.nextInt();
        
        if (n==0) {
            System.out.println("La factorielle de " + n + " est 1.");
        } else {
            int a = n;
            int x = 0;
            while (a>1) {
                x = (a*(a-1));
                a=(a-1);
            }
            System.out.println("La factorielle de " + n + " est " + x);
        }
    }
}