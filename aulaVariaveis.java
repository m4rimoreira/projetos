import java.util.Scanner;

public class aulaVariaveis{
    public static void main(String[] args){
        //recebendo a entrada do usuário
        Scanner entrada = new Scanner(System.in);
        int num;
        System.out.println("Digite o número para saber a tabuada:");
        num = entrada.nextInt();

        //calculando a tabuada

        int multiplicador  = 0;

        for (int i = 1; i <= 10; i++) {
            int resultado = 0;
            resultado = i * num;
            System.out.println(i + "x" + num + "=" + resultado );

        }
    }
}