import java.util.Scanner;
public class func {
    private static boolean checkspacelist(int qtd){
        Scanner teclado = new Scanner(System.in);
        boolean test = true;
        if (qtd == 4){
            System.out.println("Lista está cheia!");
            test = false;
        }
        return test;
    }

    public static int inserir(float notas[], int qtd){
        Scanner teclado = new Scanner(System.in);
        boolean espacoNaLista = true; //para verificar se tem espaço disponivel na lista
        char continuar = 's'; //para o usuario continuar adicionando notas

        while (espacoNaLista == true && continuar == 's'){

            System.out.print("Insira a nota do " + (qtd + 1) + "° aluno: ");
            notas[qtd] = teclado.nextFloat();

            espacoNaLista = checkspacelist(qtd);
            if (espacoNaLista == true) {
                System.out.print("Deseja continuar? s/n: ");
                continuar = teclado.next().charAt(0);
            }
            qtd++;
        }
        return qtd;
    }

    public static int listar(float notas[],int qtd){
            if (qtd == 0){
                System.out.println("lista está vazia!");
            }else{
                for(int i = 0; i < qtd; i++){
                System.out.println("Nota do " + (i+1) + "° aluno: "+ notas[i]);
            }
        }
        return qtd;
    }
    public static int pesquisar(float notas[],int qtd){

        return qtd;
    }
    public static int excluir(float notas[], int qtd){
        Scanner teclado = new Scanner(System.in);
        listar(notas, qtd);
        System.out.println("Qual nota deseja Excluir? ");
        int del = teclado.nextInt();
        if(del > qtd  || del <= 0){
            System.out.println("Voce escolheu uma opção invalida!");
        }else{
            for (int i = del; i == qtd; i++)
                notas[del] = notas[del+1];
        }

        return qtd;
    }
}



