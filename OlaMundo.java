import java.util.Scanner;

public class OlaMundo {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Informe seu nome");
        String seuNome = leia.nextLine();

        String menssagem = Saudacao(seuNome);
        System.out.println(menssagem);

    }
    public static String  Saudacao(String nome){
        return "olá, seja muito bem-vindo " + nome;
    }
}