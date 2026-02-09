# Comparativo de Testes Automatizados: SBST vs. LLMs

Este repositório contém os artefatos da Atividade Prática da **Unidade 5: IA para Geração Automática de Casos de Teste e Eficiência**.

O objetivo deste projeto é comparar a eficácia, cobertura e legibilidade de testes unitários gerados por duas abordagens distintas de Inteligência Artificial:
1.  **SBST (Search-Based Software Testing):** Utilizando algoritmos genéticos (EvoSuite).
2.  **LLM (Large Language Models):** Utilizando IA Generativa (ChatGPT/Copilot).

🛠️ Ferramentas Utilizadas
• Java JDK: Linguagem base do projeto.
• EvoSuite: Ferramenta para geração de testes baseada em algoritmos genéticos (foco em Branch Coverage).
• ChatGPT/Copilot: Assistente de IA utilizado para geração assistida de testes (Prompt Engineering).
• PITest: Ferramenta utilizada para teste de mutação e verificação da eficácia dos testes.

🚀 Como Executar os Testes
Pré-requisitos
Certifique-se de ter o Java e o JUnit configurados no seu ambiente.

1. Executando os Testes SBST (EvoSuite)
Os testes localizados na pasta /evosuite foram gerados automaticamente para maximizar a cobertura de ramos. Eles focam em cobrir cenários de borda matemáticos.
# Exemplo de comando para compilar e rodar (ajuste o classpath conforme seu ambiente)
javac -cp .:evosuite-standalone-runtime.jar CalculadoraBhaskara.java evosuite/CalculadoraBhaskara_ESTest.java
java -cp .:evosuite-standalone-runtime.jar org.junit.runner.JUnitCore CalculadoraBhaskara_ESTest

2. Executando os Testes LLM
Os testes localizados na pasta /llm foram gerados através de prompts em linguagem natural, focando na semântica e legibilidade.
# Exemplo de comando para compilar e rodar
javac -cp .:junit-4.13.2.jar CalculadoraBhaskara.java llm/CalculadoraBhaskaraTest.java
java -cp .:junit-4.13.2.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore CalculadoraBhaskaraTest

## 📂 Estrutura do Projeto
O repositório está organizado da seguinte forma:

```text
/
├── CalculadoraBhaskara.java       # Código-fonte (System Under Test)
├── /evosuite                      # Testes gerados via SBST (EvoSuite)
│   └── CalculadoraBhaskara_ESTest.java
├── /llm                           # Testes gerados via IA Generativa
│   └── CalculadoraBhaskaraTest.java
├── Relatorio_Comparativo.pdf      # Análise crítica e métricas
└── README.md                      # Documentação do projeto
