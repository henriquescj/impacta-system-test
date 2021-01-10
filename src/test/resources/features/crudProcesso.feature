#language: pt
  Funcionalidade: CRUD Processo

    Cenário de Fundo:
      Dado que o usuário está na página inicial
      E clica em Processos no menu lateral
      E clica em Novo Processo
      E preenche campo "processo_vara" com valor "Centro"
      E preenche campo "processo_numero_processo" com valor "1596"
      E preenche campo "processo_natureza" com valor "Civil"
      E preenche campo "processo_partes" com valor "The People vs OJ"
      E preenche campo "processo_assistente_social" com valor "Aurora"
      E preenche campo "processo_data_entrada" com valor "2015-04-17"
      E preenche campo "processo_data_saida" com valor "2020-09-17"
      E preenche campo "processo_data_agendamento" com valor "2017-02-18"
      E preenche campo "processo_status" com valor "Concluido"
      E preenche campo "processo_observacao" com valor "Nada"
      E no radio button "Arbitramento" seleciona "Sim"
      E no select "Urgente" seleciona "Sim"

    Cenário: Criação de novo Processo
      Quando clica em Salvar
      Então na tela de confirmação deve retornar mensagem "Processo foi criado com sucesso."

    Cenário: Visualizar um Processo
      Quando clica em Salvar
      E obtém o código do processo
      E clica em Voltar na tela do processo
      E clica em Mostrar na linha do processo
      Então na tela do processo o código deve ser igual ao obtido
      E o campo "vara" deve estar com valor "Centro"
      E o campo "numero" deve estar com valor "1596"
      E o campo "natureza" deve estar com valor "Civil"
#      E o campo "partes" deve estar com valor "The People vs OJ"
#      E o campo "urgente" deve estar com valor "S"
#      E o campo "arbitramento" deve estar com valor "S"
#      E o campo "as_social" deve estar com valor "Aurora"
#      E o campo "dt_entrada" deve estar com valor "2015-04-17"
#      E o campo "dt_saida" deve estar com valor "2020-09-17"
#      E o campo "dt_agendamento" deve estar com valor "2017-02-18"
#      E o campo "status" deve estar com valor "Concluido"
#      E o campo "observacao" deve estar com valor "Nada"

    Cenário: Atualizar um Processo
      Quando clica em Salvar
      E obtém o código do processo
      E clica em Voltar na tela do processo
      E clica em Editar na linha do processo
      E preenche campo "processo_vara" com valor "Sul"
      E preenche campo "processo_numero_processo" com valor "1598"
      E preenche campo "processo_natureza" com valor "Trabalhista"
      E clica em Salvar
      Então na tela de confirmação deve retornar mensagem "Processo atualizado com sucesso."
      E o campo "vara" deve estar com valor "Sul"
      E o campo "numero" deve estar com valor "1598"
      E o campo "natureza" deve estar com valor "Trabalhista"

    Cenário: Apagar um Processo
      Quando clica em Salvar
      E obtém o código do processo
      E clica em Voltar na tela do processo
      E clica em Apagar na linha do processo
      E confirma que deseja apagar o processo
      Então o processo não deve aparecer na lista de processos

    @ignore
    Cenário: Não fazer esse
      Quando clica em Salvar
      E obtém o código do processo
      E clica em Voltar na tela do processo
      E clica em Editar na linha do processo
      E preenche campo "processo_vara" com valor "Sci-fi"
      E preenche campo "processo_numero_processo" com valor "1984"
      E preenche campo "processo_natureza" com valor "Big brother"
      E clica em Salvar
      Então na tela de confirmação deve retornar mensagem "Processo atualizado com sucesso."
      E o campo "vara" deve estar com valor "Sci-fi"
      E o campo "numero" deve estar com valor "1984"
      E o campo "natureza" deve estar com valor "Big brother"

    Esquema do Cenário:
      Quando clica em Salvar
      E obtém o código do processo
      E clica em Voltar na tela do processo
      E clica em Editar na linha do processo
      E preenche campo "processo_numero_processo" com valor "<numero>"
      E clica em Salvar
      Então na tela de confirmação deve retornar mensagem "Processo atualizado com sucesso."
      E o campo "numero" deve estar com valor "<numero>"
      Exemplos:
        |numero|
        |15623 |
        |15628 |
        |15624 |
        |15629 |
