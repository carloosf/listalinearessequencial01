import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float notas[] = new float [5];
        int opc = 0;
        int qtd = 0;
        while (opc != 5){
            System.out.println("1 - Inserir");
            System.out.println("2 - Listar");
            System.out.println("3 - Pesquisar");
            System.out.println("4 - Excluir");
            System.out.println("5 - Sair");
            System.out.print("Informe a opção desejada: ");
            opc = teclado.nextInt();
            switch (opc) {
                case 1:
                    qtd = func.inserir(notas,qtd);
                    break;
                case 2:
                    func.listar(notas,qtd);
                    break;
                case 3:
                    func.pesquisar(notas,qtd);
                    break;
                case 4:
                    qtd = func.excluir(notas, qtd);
                    break;
                case 5:
                    System.out.println("Sair");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }
}

