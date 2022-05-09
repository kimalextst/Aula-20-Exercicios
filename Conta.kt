package exercicio1

open class Conta (
    var nomeParametro : String = "",
    var saldoParametro : Double = 0.0,
        ) {

    open fun pegarTipoConta(): String{
        return "Conta Generica"
    }

    internal fun mostrarInformacoesRecemCadastradas(){

        println("------------------------------\n")
        println("Nome do cliente: $nomeParametro")
        println("Tipo de conta: ${pegarTipoConta()}")
        println("Saldo: R$$saldoParametro")
        println("------------------------------\n")

    }

}