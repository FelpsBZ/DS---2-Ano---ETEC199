import java.util.Scanner;

public class ogro {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int e = in.nextInt();
        int d = in.nextInt();
        int resultado;
        if(e>= 0&e<=5){
            if(d>= 0&d<=5){
                if(e!=d){
                    if(e>d) {
                        resultado = e + d;
                        System.out.printf("%d\n", resultado);
                    } else {
                        resultado = 2*(d-e);
                        System.out.printf("%d\n", resultado);
                    }
                }
            }
        }
    }

}
