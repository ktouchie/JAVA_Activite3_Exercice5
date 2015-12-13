import java.util.Scanner;
class Exercice5 {
    
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Veuillez saisir un nombre entier positif:");
            int n = sc.nextInt();
            int x = n;
        
        if (n==0) {
            System.out.println("La factorielle de " + n + " est 1.");
        } else {
            for (int i=1; i<n; i++) {
                x = (x*i);
            }
            System.out.println("La factorielle de " + n + " est " + x);
        }
    }
}