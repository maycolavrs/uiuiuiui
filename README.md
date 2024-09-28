

markdown
# Convenção de Commits

Para garantir consistência e clareza no histórico de commits, siga as diretrizes abaixo. Elas facilitarão o entendimento das mudanças feitas no projeto e melhorarão a colaboração entre os membros da equipe.

## Formato do Commit

Utilizamos uma convenção de commits baseada nos tipos de alterações que estão sendo realizadas. O formato deve seguir a estrutura:

```plaintext
<tipo>: <resumo breve>

<linha em branco>

<descrição detalhada (opcional)>

<linha em branco>

<informações adicionais (opcional)>
```

## **Tipos de Commit**

- **feat**: Introdução de uma nova funcionalidade no aplicativo.
- **fix**: Correção de um bug no sistema.
- **docs**: Atualização de documentação (por exemplo, README ou guias de instalação).
- **style**: Alterações que não afetam o funcionamento do código (espaços, formatação, etc.).
- **refactor**: Refatoração de código sem correção de bugs ou adição de funcionalidades.
- **test**: Inclusão ou modificação de testes automatizados.
- **chore**: Alterações menores, como atualizações de dependências ou configurações de build.

## **Exemplos de Commits**

- `feat: adiciona funcionalidade de pedidos online`
- `fix: corrige erro na validação do campo de quantidade`
- `docs: atualiza README com instruções para deploy`
- `style: ajusta indentação em arquivos JavaScript`
- `refactor: melhora a legibilidade da função de cálculo de preço total`

## **Detalhamento das Partes do Commit**

### **Header**
O cabeçalho do commit deve conter:

```plaintext
<tipo>: <resumo breve>
```

- **tipo**: Define o tipo de mudança (feat, fix, docs, etc.).
- **resumo breve**: Descrição curta e objetiva da mudança (no tempo presente, sem ponto final e sem começar com letra maiúscula).

### **Body (opcional)**
Aqui pode-se incluir uma descrição mais detalhada sobre a mudança:

- Explique **por que** a mudança foi feita.
- Detalhe **como** a mudança foi implementada.
- Deve ser escrita no tempo presente, em parágrafos curtos.

### **Footer (opcional)**
O rodapé pode conter informações adicionais, como:

- **BREAKING CHANGE**: Para mudanças que quebram a compatibilidade com versões anteriores.
- **Closes**: Referência a issues ou tickets que foram resolvidos pela mudança (ex: `Closes #12`).

## **Benefícios de Seguir a Convenção**

- **Histórico claro**: Facilita a navegação e o entendimento das mudanças feitas no projeto.
- **Manutenção simplificada**: Torna mais fácil identificar a origem de bugs e funcionalidades.
- **Melhor colaboração**: Colaboradores conseguem entender rapidamente o impacto de cada commit.
```

Agora os tópicos principais como "Tipos de Commit", "Exemplos de Commits" e "Detalhamento das Partes do Commit" estão destacados, deixando o documento mais organizado e fácil de entender.
