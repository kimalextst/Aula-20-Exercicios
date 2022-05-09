package exercicio1

class ContaPoupanca (
    nomeParametro : String = "",
    saldoParametro : Double = 0.0,
        ) : Conta (nomeParametro, saldoParametro){

    override fun pegarTipoConta(): String{
        return "Conta Poupança"
    }
}

