class TabelaDeDispersao:
    def __init__(self, tamanho):
        self.tamanho = tamanho
        self.tabela = [None] * tamanho

    def funcao_hash(self, chave): #MAIOR COMPLEXIDADE
        return hash(chave) % self.tamanho

    def inserir(self, chave, valor):
        indice = self.funcao_hash(chave)
        if self.tabela[indice] is None:
            self.tabela[indice] = []
        self.tabela[indice].append((chave, valor))

    def buscar(self, chave):
        indice = self.funcao_hash(chave)
        if self.tabela[indice] is not None:
            for item in self.tabela[indice]:
                if item[0] == chave:
                    return item[1]
        return None

tabela = TabelaDeDispersao(10)
tabela.inserir("chave1", "valor1")
tabela.inserir("chave2", "valor2")

resultado = tabela.buscar("chave1")
if resultado is not None:
    print("Valor encontrado:", resultado)
else:
    print("Valor não encontrado.")
