package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "José"
    var cpf: String = "123.456.789-01"
    var idade:Int = 35
}

fun main() {
    val pessoa = Pessoa()

    println(pessoa.nome)
    println(pessoa.cpf)
    println(pessoa.idade)
}