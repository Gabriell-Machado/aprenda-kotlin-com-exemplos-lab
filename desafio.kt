// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

class Usuario(val nome: String)

data class ConteudoEducacional(val nome: String, val duracao: Int)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>, val nivel: Nivel) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)   
    } 

}

fun main() {
    val moduloKotlin = ConteudoEducacional("curso kotlin", 120)
    
    val listConteudos = mutableListOf<ConteudoEducacional>()
    listConteudos.add(moduloKotlin)
    val joao = Usuario("joao")
    val formacao = Formacao("Bootcamp Kotlin",listConteudos,Nivel.BASICO)
    formacao.matricular(joao)
    println("${formacao.nome} - ${formacao.nivel}")
}
