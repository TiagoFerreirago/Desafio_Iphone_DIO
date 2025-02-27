
import java.util.Scanner;

public class Menu {

    private Iphone iphone;

    public Menu(Iphone iphone){
        this.iphone = iphone;
    }

    public void menu(){

        Scanner scanner = new Scanner(System.in);
      
        int opcao = -1;

        

        while(opcao != 0){

            System.out.println("1 - Ligar");
            System.out.println("2 - Atender");
            System.out.println("3 - Iniciar correio de voz");
            System.out.println("4 - Exibir página");
            System.out.println("5 - Adicionar nova aba");
            System.out.println("6 - Atualizar página");
            System.out.println("7 - Tocar");
            System.out.println("8 - Pausar");
            System.out.println("9 - Selecionar música");
            System.out.println("0 - Sair");

            System.out.println("Digite a opção desejada: ");
            opcao = scanner.nextInt();

            switch(opcao){

                case 1 -> {
                    System.out.println("Digite o número para ligar: ");
                    String numero = scanner.next();
                    iphone.ligar(numero);
                }
                case 2 -> iphone.atender();
                case 3 -> iphone.iniciarCorreioVoz();
                case 4 -> {
                    System.out.println("Digite a url da página: ");
                    String url = scanner.next();
                    iphone.exibirPagina(url);
                }
                case 5 -> iphone.adicionarNovaAba();
                case 6 -> iphone.atualizarPagina();
                case 7 -> iphone.tocar();
                case 8 -> iphone.pausar();
                case 9 -> {
                    System.out.println("Digite o nome da música: ");
                    String musica = scanner.nextLine();
                    iphone.selecionarMusica(musica);
                }
                case 0 -> System.out.println("Saindo...");
            }
        }
    }
}
