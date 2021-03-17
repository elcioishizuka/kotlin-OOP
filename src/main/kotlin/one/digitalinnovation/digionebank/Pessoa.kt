package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "José"

    var cpf: String = "123.456.789-01"
    private set

    var idade:Int = 35

    inner class Endereco{
        var pais: String = "Brasil"
    }

}

fun main() {
    val pessoa = Pessoa()
    // pessoa.cpf = "new cpf" // Once the set method was changed to private cpf cannot be reassigned.
    pessoa.idade = 45 // Setter for idade is not private, so it can be reassigned.

    println(pessoa.nome)
    println(pessoa.cpf)
    println(pessoa.idade)

    println(pessoa.Endereco().pais)
}