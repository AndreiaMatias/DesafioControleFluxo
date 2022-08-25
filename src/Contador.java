import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner parametro = new Scanner(System.in);
        System.out.print("Informe o primeiro parâmetro: ");
        int parametroUm = parametro.nextInt();
        System.out.print("Informe o segundo parâmetro: ");
        int parametroDois = parametro.nextInt();

        try{
            contar(parametroUm, parametroDois);
        }catch(ParametrosInvalidosException ex){
            System.out.println("O segundo parametro deve ser maior que o primeiro.");
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        if (parametroUm >= parametroDois){
            throw new ParametrosInvalidosException();
        } else {
            int contagem = parametroDois - parametroUm;
            for (int i=1; i <= contagem; i++){
                System.out.println("Imprimindo o número " + i);
            }
        }

    }
}

