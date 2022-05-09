package exercicio1

import kotlin.system.exitProcess

class Cadastro {
    private var listaContas : ArrayList <Conta> = ArrayList()
    private lateinit var objetoContaCadastrada : Conta

    companion object InicioDoPrograma {

        fun introducao() {
            println("Bem-vinde! Meu nome é Alex e irei te apresentar as opções de conta ^^")
            println("---------------------------------------------------------------------")
            println("Se deseja uma conta para depositar seu salário, mas não utiliza-lo,")
            println("apenas sacar, a conta salário [1] é perfeita para você!\n")
            println("Se deseja um conta para guardar seu dinheiro e deixa-lo render")
            println("nesse caso seu match seria com a conta poupança [2].\n")
            println("Mas se deseja uma conta para utilizar, ter cartôes de crédito e outros,")
            println("a conta corrente [3] é a escolha certa!")
            println("---------------------------------------------------------------------")
        }
    }

    fun escolhaOpcaoConta() {
        println("Vamos criar uma conta?")
        println("---------------------------------------------------------------------")
        println("[1] Sim, desejo criar uma conta salario.")
        println("[2] Sim, desejo criar uma conta poupança.")
        println("[3] Sim, desejo criar uma conta corrente.")
        println("[4] Não, obrigado. Desejo sair do sistema.")
        println("---------------------------------------------------------------------")
        val escolha = readln().toInt()

        when (escolha) {
            1 -> objetoContaCadastrada = ContaSalario()
            2 -> objetoContaCadastrada = ContaPoupanca()
            3 -> objetoContaCadastrada = ContaCorrente()
            4 -> {
                println("-----------------------------------------------------\n")
                println("Ah, é uma pena. Talvez uma outra hora nos vemos ^^")
                exitProcess(0)
            }
        }
    }

    fun cadastrarInformacoesUsuario(){
        println("-----------------------------------------------------")
        println("Vamos começar o cadrastro?\n")
        objetoContaCadastrada.nomeParametro = pegarNome()
        objetoContaCadastrada.saldoParametro = pegarSaldo()

        objetoContaCadastrada.mostrarInformacoesRecemCadastradas()
        salvarInformacoesCadastradas()
    }

    private fun pegarNome(): String {
        println("Qual seu nome?\n")
        return readln()
    }

    private fun pegarSaldo(): Double {
        println("\nQual será o saldo inicial na sua conta?")
        println("(Se for conta salário, insira R$0.00 por favor)\n")
        print("R$")
        return readln().toDouble()
    }

    private fun salvarInformacoesCadastradas(){
        listaContas.add(objetoContaCadastrada)
    }

    internal fun mostrarContasCadastradas(){
        listaContas.forEach{ conta ->
            conta.mostrarInformacoesRecemCadastradas()
        }
    }
}