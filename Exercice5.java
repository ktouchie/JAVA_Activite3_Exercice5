import java.util.Scanner;
class Exercice5 {
    
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Veuillez saisir un nombre entier positif:");
            int n = sc.nextInt();
        
        if (n==0) {
            System.out.println("La factorielle de " + n + " est 1.");
        } else {
            int x = n;
            for (int i=x; i>0; i--) {
                x = (x* (x-1))
            }
            System.out.println("La factorielle de " + n + " est " + x);
        }
    }
}