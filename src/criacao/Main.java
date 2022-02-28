package criacao;

public class Main {
    public static void main(String[] args) {
        System.out.println("Operações Básicas");
        OperacoesBasicas.soma(2, 3);
        OperacoesBasicas.divisao(2, 3);
        OperacoesBasicas.multiplicacao(2, 3);
        OperacoesBasicas.divisao(2, 3);

        System.out.println("Criacao.Mensagem");
        Mensagem.obterMensagem(5);
        Mensagem.obterMensagem(2);
        Mensagem.obterMensagem(16);

        System.out.println("Empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);
    }
}
