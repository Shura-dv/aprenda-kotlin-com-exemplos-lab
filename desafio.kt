// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

class Usuario(val nome: String, val idade: Int, val cidade: String, val estado: String) {
    override fun toString(): String {
        return "$nome, $idade anos, $cidade-$estado"
    }
}

data class ConteudoEducacional(val nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, val nivel: Nivel, val conteudos: MutableList<ConteudoEducacional> = mutableListOf()) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        println("$usuario foi matriculado(a) na formação: $nome")
    }
}

fun main() {
    // Conteúdos educacionais
    val conteudo1 = ConteudoEducacional("Introdução à Programação", 90)
    val conteudo2 = ConteudoEducacional("Banco de Dados Avançado", 120)
    val conteudo3 = ConteudoEducacional("Arquitetura de Redes", 150)
    val conteudo4 = ConteudoEducacional("Segurança da Informação", 100)
    val conteudo5 = ConteudoEducacional("Informática Básica", 60)
    val conteudo6 = ConteudoEducacional("Sistemas Operacionais", 90)
    
    // Formações
    val formacaoTI = Formacao("Desenvolvedor", Nivel.INTERMEDIARIO)
    val formacaoCloud = Formacao("Cloud", Nivel.AVANCADO)
    val formacaoInformatica = Formacao("Informática", Nivel.BASICO)
    
    // Criação de usuários
    val usuario1 = Usuario("Marcela", 25, "Curitiba", "PR")
    val usuario2 = Usuario("Diana", 28, "Espirito Santo", "ES")
    val usuario3 = Usuario("Lauro", 38, "Fortaleza", "CE")
    val usuario4 = Usuario("Bruno", 27, "Belo Horizonte", "MG")
    
    // Matricula
    formacaoTI.matricular(usuario3)
    formacaoTI.matricular(usuario2)
    formacaoCloud.matricular(usuario1)
    formacaoInformatica.matricular(usuario4)
    
    // Exibição dos inscritos nas formações
    println("Usuários inscritos na formação de ${formacaoTI.nome}:")
    for (inscrito in formacaoTI.inscritos) {
        println(inscrito)
    }
    
    println("Usuários inscritos na formação de ${formacaoCloud.nome}:")
    for (inscrito in formacaoCloud.inscritos) {
        println(inscrito)
    }
    
    println("Usuários inscritos na formação de ${formacaoInformatica.nome}:")
    for (inscrito in formacaoInformatica.inscritos) {
        println(inscrito)
    }
    
    // Adição dos conteúdos às formações
    formacaoTI.conteudos.add(conteudo1)
    formacaoTI.conteudos.add(conteudo2)
    
    formacaoCloud.conteudos.add(conteudo3)
    formacaoCloud.conteudos.add(conteudo4)
    
    formacaoInformatica.conteudos.add(conteudo5)
    formacaoInformatica.conteudos.add(conteudo6)
    
    // Exibição dos conteúdos das formações
    println("Conteúdos da formação de ${formacaoTI.nome}:")
    for (conteudo in formacaoTI.conteudos) {
        println("${conteudo.nome} (${conteudo.duracao} minutos)")
    }
    
    println("Conteúdos da formação de ${formacaoCloud.nome}:")
    for (conteudo in formacaoCloud.conteudos) {
        println("${conteudo.nome} (${conteudo.duracao} minutos)")
    }
    
    println("Conteúdos da formação de ${formacaoInformatica.nome}:")
    for (conteudo in formacaoInformatica.conteudos) {
        println("${conteudo.nome} (${conteudo.duracao} minutos)")
    }
}

