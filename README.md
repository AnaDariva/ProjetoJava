# PROJETO_FINAL_JAVA
Sistema de Gerenciamento de atividades para aula de Programação Orientada a Objetos

Especificação do Trabalho
Objetivo
Desenvolver um programa com um tema de sua escolha, que deverá incluir:

Um banco de dados com no mínimo 3 tabelas relacionadas.
Funcionalidades de inserção, alteração, exclusão e consulta de dados, além de outras funcionalidades que julgar pertinentes.

1. Pré-requisitos
Linguagem de Programação: Java.
Persistência de Dados: JPA (Java Persistence API) com Hibernate.
Banco de Dados: PostgreSQL (o banco deve ser criado com o seu nome).

2. Estrutura de Pacotes
Organize o projeto em pacotes conforme as responsabilidades das classes. Sugestões:
model: para as classes de entidade.
dao: para as classes de acesso a dados.
Outros pacotes podem ser criados conforme necessário para organizar melhor o código. Não é obrigatório seguir o modelo clássico de MVC, mas busque manter uma estrutura lógica e clara.

3. Conexão e Acesso aos Dados
Utilize a EntityManager para realizar operações no banco de dados.
Mapeie os objetos Java para as tabelas do banco usando as anotações da JPA.
Realize as consultas ao banco utilizando JPQL (Java Persistence Query Language).

4. Interação com o Usuário
A aplicação será baseada em linha de comando, ou seja:
Toda a entrada e saída de dados será feita pelo terminal.
Siga o padrão demonstrado em sala para criar menus e interações intuitivas.

5. Funcionalidades Obrigatórias
A aplicação deverá implementar:
Operações básicas:
Inserção de registros.
Alteração de registros.
Exclusão de registros com comportamento de cascata, para remover automaticamente registros relacionados e evitar problemas de integridade referencial.
Consultas diversificadas, que atendam a diferentes necessidades.
Relatórios sumarizados para auxiliar na tomada de decisões.
Para relatórios, utilize o padrão VO (Value Object) apresentado em aula.

<h2 align="center">💻 Languages</h2>
<p align="center">
    <a href="https://www.java.com" target="_blank" rel="noreferrer">
        <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg" alt="java" width="40" height="40"/>
    </a>
    <a href="https://www.postgresql.org" target="_blank" rel="noreferrer">
        <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/postgresql/postgresql-original-wordmark.svg" alt="postgresql" width="40" height="40"/>
    </a>
</p>

