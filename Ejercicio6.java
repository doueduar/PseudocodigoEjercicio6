import java.util.Scanner;

/**
 * Ejercicio6
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mayor,menor,Cm,CM;
        mayor =0; menor = 0; Cm = 0; CM = 0;
        System.out.println("total de edades a ingresar ");
        int total = scanner.nextInt();
        int [] N = new int[total];
        for (int i = 0; i < total ; i++) {
            System.out.print(i+". ingrese la edad");
            N[i] = scanner.nextInt();
            if ((0<N[i])&&(N[i]<25)) {
                menor += N[i];
                Cm++;
            } else {
                if (25 <= N[i]) {
                    mayor+=N[i];
                    CM++;
                }else{
                    System.out.println("no es perminito este Valor");
                }
                
            }
        }
        mayor /= CM;
        menor /= Cm;
        System.out.println("promedio de las edades mayores: "+mayor+" menores "+menor);        
    }
}