# Sistema-de-Controle-de-Pedidos-e-Entregas-de-Delivery
## Trabalho feito com intuito de aprendizado! 

### Sistema de Controle de Pedidos e Entregas de Delivery. Este sistema vai gerenciar pedidos de uma empresa de delivery. 

### Segue, abaixo, as exatas requisições do sistema, as limitações impostas e o objetivo do projeto:


## Objetivo do sistema
  ### O sistema deve:
    cadastrar clientes;  
    registrar pedidos;  
    controlar os itens de cada pedido;
    organizar pedidos em fila de preparo;
    manter histórico de pedidos concluídos;
    permitir navegação entre pedidos para consulta e edição.
  
## Principais módulos e classes
  
### 1. Classe Cliente
    Atributos:
      idCliente  
      nome
      telefone
      endereco
    Métodos:
      cadastrar()
      atualizarDados()
      exibirDados()
  
  ### 2. Classe Produto
    Atributos:
      idProduto
      nome
      preco
      categoria
      estoque
    Métodos:
      atualizarEstoque()
      exibirProduto()

  ### 3. Classe Pedido
    Atributos:
      idPedido
      cliente
      status
      valorTotal
      enderecoEntrega
      lista de itens
    Métodos:
      adicionarItem()
      removerItem()
      calcularTotal()
      finalizarPedido()
      exibirResumo()
      
  ### 4. Classe ItemPedido
    Atributos:
      produto
      quantidade
      subtotal
    Métodos:
      calcularSubtotal()
      
  ### 5. Classe DeliverySystem
  #### Classe central do sistema.
    Atributos:
      lista de clientes
      lista duplamente encadeada de pedidos ativos
      fila de preparo
      pilha de pedidos concluídos
      catálogo de produtos
    Métodos:
      cadastrarCliente()
      criarPedido()
      enfileirarPedido()
      prepararProximoPedido()
      finalizarPedido()
      exibirHistorico()
      navegarPedidosAtivos()
      
  ## Uso obrigatório das estruturas
  ### Lista simplesmente encadeada
    Deve Ser usada para:
      lista de itens do pedido;
      lista de produtos cadastrados;
      lista de clientes.
      Cada pedido pode conter uma lista simplesmente encadeada de itens.
  ### Lista duplamente encadeada
    Deve ser usada para:
      pedidos ativos em edição;
      navegação entre pedidos abertos.
      Exemplo: o atendente pode abrir o pedido anterior ou próximo sem reiniciar a busca.
  ### Fila encadeada
    Deve ser usada para:
      fila de preparação dos pedidos.
      Pedidos entram no final da fila e saem do início quando forem preparados.
  ### Pilha encadeada
    Deve ser usada para:
      histórico de pedidos concluídos;
      cancelamentos recentes;
      últimas entregas realizadas.
      O último pedido finalizado fica no topo da pilha.
  ## Fluxo geral do sistema
    O cliente é cadastrado.
    O atendente cria um pedido.
    Os itens são inseridos no pedido.
    O pedido entra na fila de preparação.
    A cozinha prepara o próximo pedido da fila.
    Ao concluir, o pedido é enviado e registrado na pilha de histórico.
    Os pedidos ativos podem ser navegados em uma lista duplamente encadeada.
    O sistema exibe relatórios e histórico de entregas.
  ## Funcionalidades mínimas para o menu
    cadastrar cliente
    listar clientes
    cadastrar produto
    criar pedido
    adicionar item ao pedido
    exibir pedidos em preparo
    preparar próximo pedido
    finalizar pedido
    exibir histórico de pedidos
    navegar entre pedidos ativos
    sair
