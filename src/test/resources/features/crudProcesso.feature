#language: pt
  Funcionalidade: CRUD Processo

    Cenário de Fundo:
      Dado que estou na página principal
      E clicou em Processos no menu lateral
      E clicou em Novo Processo
      E em processo preencher campo "processo_vara" com valor de "Centro"
      E em processo preencher campo "processo_numero_processo" com valor de "159"
      E em processo preencher campo "processo_natureza" com valor de "Civil"
      E em processo preencher campo "processo_partes" com valor de "The People vs OJ"
      E em processo preencher campo "processo_assistente_social" com valor de "Aurora"
      E em processo preencher campo "processo_data_entrada" com valor de "2015-04-17"
      E em processo preencher campo "processo_data_saida" com valor de "2020-09-17"
      E em processo preencher campo "processo_data_agendamento" com valor de "2017-02-18"
      E em processo preencher campo "processo_status" com valor de "Concluido"
      E em processo preencher campo "processo_observacao" com valor de "Nada"
      E radio button "Arbitramento" selecionar "Sim"
      E combobox "Urgente" selecionar "Sim"

    @run
    Cenário: Criação de novo Processo
      Quando em processo clicar em Salvar
      Então na tela de confirmação deveria retornar mensagem "Processo foi criado com sucesso."

    @run
    Cenário: Visualizar um Processo
      Quando em processo clicar em Salvar
      E obter o código do processo
      E clicar em Voltar na tela do processo
      E clicar no botão mostrar na linha do registro do processo
      Então na tela do processo o código deveria ser do registro cadastrado
      E o campo "vara" deve estar com valor "Centro"
      E o campo "numero" deve estar com valor "159"
      E o campo "natureza" deve estar com valor "Civil"
      E o campo "partes" deve estar com valor "The People vs OJ"
      E o campo "urgente" deve estar com valor "S"
      E o campo "arbitramento" deve estar com valor "N"
      E o campo "as_social" deve estar com valor "Aurora"
      E o campo "dt_entrada" deve estar com valor "2015-04-17"
      E o campo "dt_saida" deve estar com valor "2020-09-17"
      E o campo "dt_agendamento" deve estar com valor "2017-02-18"
      E o campo "status" deve estar com valor "Concluido"
      E o campo "observacao" deve estar com valor "Nada"

      Quando o usuário clica no botão de Salvar
      E deseja ver as informações do Processo
      Então o usuário deve ver a mensagem "sucesso"
      E o usuário deve ver vara com valor de "Centro"
      E o usuário deve ver numero_processo com valor de "159"
      E o usuário deve ver natureza com valor de "Civil"
      E o usuário deve ver partes com valor de "The People vs OJ"
      E o usuário deve ver urgente com valor de "S"
      E o usuário deve ver arbitramento com valor de "N"
      E o usuário deve ver assistente_social com valor de "Aurora"
      E o usuário deve ver data_entrada com valor de "2015-04-17"
      E o usuário deve ver data_saida com valor de "2020-09-17"
      E o usuário deve ver data_agendamento com valor de "2017-02-18"
      E o usuário deve ver status com valor de "Concluido"
      E o usuário deve ver observacao com valor de "Nada"

    Cenário: Atualizar um Processo com put
      Quando o usuário clica no botão de Salvar
      E o usuário informa vara com valor de "Sul"
      E o usuário informa numero_processo com valor de "15945"
      E o usuário informa natureza com valor de "Civil"
      E o usuário informa partes com valor de "The People vs OJ"
      E o usuário informa urgente com valor de "S"
      E o usuário informa arbitramento com valor de "N"
      E o usuário informa assistente_social com valor de "Aurora"
      E o usuário informa data_entrada com valor de "2015-04-17"
      E o usuário informa data_saida com valor de "2020-09-17"
      E o usuário informa data_agendamento com valor de "2017-02-18"
      E o usuário informa status com valor de "Concluido"
      E o usuário informa observacao com valor de "Nada"
      E o usuário clica no botão de salvar novamente
      E deseja ver as informações do Processo
      Então o usuário deve ver a mensagem "sucesso"
      E o usuário deve ver vara com valor de "Sul"
      E o usuário deve ver numero_processo com valor de "15945"
      E o usuário deve ver natureza com valor de "Civil"
      E o usuário deve ver partes com valor de "The People vs OJ"
      E o usuário deve ver urgente com valor de "S"
      E o usuário deve ver arbitramento com valor de "N"
      E o usuário deve ver assistente_social com valor de "Aurora"
      E o usuário deve ver data_entrada com valor de "2015-04-17"
      E o usuário deve ver data_saida com valor de "2020-09-17"
      E o usuário deve ver data_agendamento com valor de "2017-02-18"
      E o usuário deve ver status com valor de "Concluido"
      E o usuário deve ver observacao com valor de "Nada"

    Cenário: Apagar um Processo
      Quando o usuário clica no botão de Salvar
      E o usuário clica no botão de Apagar
      Então o usuário deve ver a mensagem "sem conteudo"

    @ignore
    Cenário: Não fazer esse
      Quando o usuário clica no botão de Salvar
      E o usuário informa vara com valor de "Algum"
      E o usuário informa numero_processo com valor de "20102"
      E o usuário informa natureza com valor de "Palavrao"
      E o usuário informa partes com valor de "The People vs AJ"
      E o usuário informa urgente com valor de "N"
      E o usuário informa arbitramento com valor de "S"
      E o usuário informa assistente_social com valor de "Roberta"
      E o usuário informa data_entrada com valor de "2016-04-17"
      E o usuário informa data_saida com valor de "2020-10-30"
      E o usuário informa data_agendamento com valor de "2014-05-25"
      E o usuário informa status com valor de "Longe"
      E o usuário informa observacao com valor de "Nada"
      E o usuário clica no botão de salvar novamente
      E deseja ver as informações do Processo
      Então o usuário deve ver a mensagem "sucesso"
      E o usuário deve ver vara com valor de "Algum"
      E o usuário deve ver numero_processo com valor de "20102"
      E o usuário deve ver natureza com valor de "Palavrao"
      E o usuário deve ver partes com valor de "The People vs AJ"
      E o usuário deve ver urgente com valor de "N"
      E o usuário deve ver arbitramento com valor de "S"
      E o usuário deve ver assistente_social com valor de "Roberta"
      E o usuário deve ver data_entrada com valor de "2016-04-17"
      E o usuário deve ver data_saida com valor de "2020-10-30"
      E o usuário deve ver data_agendamento com valor de "2014-05-25"
      E o usuário deve ver status com valor de "Longe"
      E o usuário deve ver observacao com valor de "Nada nao"

    Esquema do Cenário:
      Quando o usuário clica no botão de Salvar
      E o usuário clica no botão de Apagar
      Então o usuário deve ver a mensagem "<mensagem>"
      Exemplos:
        |mensagem     |
        |sem conteudo |
