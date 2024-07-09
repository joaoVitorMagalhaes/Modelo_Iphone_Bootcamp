import Telefone.AparelhoTelefonico;
import Telefone.NavegadorInternet;
import Telefone.ReprodutorMusical;

public class PrincipalTelefone {


    public static void main(String[] args) {

        AparelhoTelefonico aparelho = new AparelhoTelefonico();
        aparelho.ligar();
        aparelho.atender();
        aparelho.iniciarCorreioVoz();

        ReprodutorMusical reprodutor = new ReprodutorMusical();
        reprodutor.tocar();
        reprodutor.pausar();
        reprodutor.selecionarMusica();

        NavegadorInternet navegador = new NavegadorInternet();
        navegador.exibirPagina();
        navegador.adicionarNovaAba();
        navegador.atualizarPagina();
    }
}
