package exercicio1

import kotlin.system.exitProcess

class Menu {
    companion object Menu {

        fun miniMenu(objetoCadastro: Cadastro) {
            println("---------------------------------------------------------------------\n")
            println("O que deseja fazer agora?")
            println("[1] Criar uma nova conta")
            println("[2] Ver contas cadastradas")
            println("[3] Sair")
            val escolha = readln().toInt()

            when (escolha) {
                1 -> {
                    objetoCadastro.escolhaOpcaoConta()
                    objetoCadastro.cadastrarInformacoesUsuario()
                    miniMenu(objetoCadastro)
                    }

                2 -> {
                    objetoCadastro.mostrarContasCadastradas()
                    miniMenu(objetoCadastro)
                }

                3 -> exitProcess(0)
            }
        }
    }
}