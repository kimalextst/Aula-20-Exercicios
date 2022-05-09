package exercicio1

import exercicio1.Cadastro.InicioDoPrograma.introducao
import exercicio1.Menu.Menu.miniMenu

fun main(){
    introducao()

    val objetoCadastroConta : Cadastro = Cadastro()

    objetoCadastroConta.escolhaOpcaoConta()
    objetoCadastroConta.cadastrarInformacoesUsuario()

    miniMenu(objetoCadastroConta)
}