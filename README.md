# Calculadora de Financiamento de carros 🚗💰

Um simples **calculador de financiamento** que ajuda a calcular o valor total a ser pago em um financiamento de veículo com base em informações fornecidas pelo cliente.

## Funcionalidades ✨

- **Entrada de Dados**: O usuário informa seu nome, o valor do veículo, a taxa de juros anual e o prazo de financiamento em anos.
- **Cálculos Financeiros**:
  - Valor da parcela mensal 💵
  - Valor total pago ao final do financiamento 🏦
  - Diferença entre o valor inicial e o total pago 📊
- **Resultados**: Os resultados são exibidos no console e o usuário é redirecionado de volta para o formulário.

## Estrutura do Projeto 📁

- **Servlet**: `CalculoValor.java`
- **HTML**: `index.html`

### `CalculoValor.java`

Este servlet processa as requisições e realiza os cálculos financeiros. Aqui está um resumo do que ele faz:

- Recebe parâmetros do cliente via `HttpServletRequest`.
- Calcula o valor da parcela mensal e o valor total a ser pago.
- Exibe os resultados no console.
- Redireciona o usuário de volta ao formulário HTML.



