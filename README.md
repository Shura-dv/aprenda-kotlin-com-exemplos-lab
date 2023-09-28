# Aprenda Kotlin Com Exemplos: Desafio de Projeto (Lab)

Desafio de Projeto criado para avaliação do conteúdo técnico explorado no repositório [aprenda-kotlin-com-exemplos](https://github.com/digitalinnovationone/aprenda-kotlin-com-exemplos). **Nesse contexto, iremos abstrair o seguinte domínio de aplicação:**

**A [DIO](https://web.dio.me) possui `Formacoes` incríveis que têm como objetivo oferecer um conjunto de `ConteudosEducacionais` voltados para uma stack tecnológica específica, preparando profissionais de TI para o mercado de trabalho. `Formacoes` possuem algumas características importantes, como `nome`, `nivel` e seus respectivos `conteudosEducacionais`. Além disso, tais experiências educacionais têm um comportamento relevante ao nosso domínio, definido pela capacidade de `matricular` um ou mais `Alunos`.**


```kotlin
TODO("Crie uma solução em Koltin abstraindo esse domínio. O arquivo [desafio.kt] te ajudará 😉")
```

# Implementações:

* A enumeração chamada Nivel, foi utilizada para representar os níveis de dificuldade das formações educacionais oferecidas pela "DIO" (Digital Innovation One).
* Como a classe `Usuario` serve para representar os indivíduos que se inscrevem nas formações oferecidas pela "DIO", os atributos nome, idade, cidade e estado foram adicionados para uma riqueza maior de informações.
* A classe `ConteudoEducacional` foi criada para representar os módulos ou conteúdos educacionais oferecidos dentro de uma formação.
* A classe `Formacao` representa as formações educacionais oferecidas pela "DIO". Cada formação tem atributos como `nome`, `nivel` e uma lista de `conteudos`. Além disso, a classe mantém uma lista de inscritos que armazena os usuários matriculados nessa formação. Essas matriculas são feitas através do método `matricular`.
* A função `main` simula alguns cenários de teste, com a criação de instâncias de conteúdos educacionais, formações e usuários. Usuários matriculados são listados juntamente com as formações e seus conteúdos.
