import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro ");
        int parametro1 = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro ");
        int parametro2 = terminal.nextInt();
        terminal.close();
        try {
            contar(parametro1, parametro2);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException{
        int contagem = parametro2 - parametro1;
        if(parametro1 > parametro2)
            throw new ParametrosInvalidosException( "O segundo parâmetro deve ser maior que o primeiro");
        for(int i = 1; i <= contagem; i++){
            System.out.printf("Imprimindo o número %d%n", i);
        }
    }

}
