package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Banco

fun main() {
    val digiOneBank = Banco("DigiOne", 12)
    println("${digiOneBank.nome} - ${digiOneBank.numero}")

    val banco2 = digiOneBank.copy(nome="DigiTwo")
    println(banco2.info())

}