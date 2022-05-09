package exercicio1

class ContaSalario (
    nomeParametro : String = "",
    saldoParametro : Double = 0.0,
        ) : Conta (nomeParametro, saldoParametro){

    override fun pegarTipoConta(): String{
        return "Conta Salário"
    }
}