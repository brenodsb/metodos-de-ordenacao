class NoArvore:
    def __init__(self, chave):
        self.chave = chave
        self.esquerda = None
        self.direita = None

def busca_arvore_binaria(raiz, chave):
    if raiz is None or raiz.chave == chave:
        return raiz

    if chave < raiz.chave: #MAIOR COMPLEXIDADE
        return busca_arvore_binaria(raiz.esquerda, chave)
    else:
        return busca_arvore_binaria(raiz.direita, chave)

raiz = NoArvore(10)
raiz.esquerda = NoArvore(5)
raiz.direita = NoArvore(15)
raiz.esquerda.esquerda = NoArvore(3)
raiz.esquerda.direita = NoArvore(7)

chave_procurada = 7
resultado = busca_arvore_binaria(raiz, chave_procurada)

if resultado:
    print(f"Chave {chave_procurada} encontrada na árvore.")
else:
    print(f"Chave {chave_procurada} não encontrada na árvore.")
