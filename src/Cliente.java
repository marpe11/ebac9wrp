import java.util.Scanner;

public class Cliente {

    private Integer codigo;


    private Double valorDecimal = 10.1;


    private Float valorDecimal1= 10.1f;

    private Short shor;

    private Byte bi;

    private Character letra = 'a';

    public static void main(String[] args) {

        // Criar um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário que digite um valor inteiro
        System.out.print("Digite um valor inteiro: ");

        // Ler o valor digitado pelo usuário como uma String
        String valorDigitado = scanner.next();

        // Converter a String para um tipo primitivo (int)
        int valorPrimitivo = Integer.parseInt(valorDigitado);

        // Exibir o valor primitivo
        System.out.println("Você digitou (primitivo): " + valorPrimitivo);

        // Converter o valor primitivo para o tipo wrapper correspondente (Integer)
        Integer valorWrapper = Integer.valueOf(valorPrimitivo);

        // Exibir o valor wrapper
        System.out.println("Você digitou (wrapper): " + valorWrapper);

        // Fechar o Scanner para evitar vazamentos de recursos
        scanner.close();

        // Impressão final
        System.out.println("Valores após a conversão:");
        System.out.println("Primitivo: " + valorPrimitivo);
        System.out.println("Wrapper: " + valorWrapper);

        //boxing
        Boolean status = true;
        Character c =   'A';
        Integer idade = 10;
        Long cpf = 9999999l;

        //unboxing
        boolean status2 = Boolean.TRUE;
        char letra2 = Character.valueOf('A');
        int idade2 = Integer.valueOf(2);



    }


}
