def busca_binaria(arr, elemento):
    esquerda, direita = 0, len(arr) - 1

    while esquerda <= direita: #MAIOR COMPLEXIDADE
        meio = (esquerda + direita) // 2

        if arr[meio] == elemento:
            return meio
        elif arr[meio] < elemento:
            esquerda = meio + 1
        else:
            direita = meio - 1

    return -1

lista_ordenada = [1, 3, 5, 7, 9, 11, 13, 15, 17]
elemento_procurado = 9
indice = busca_binaria(lista_ordenada, elemento_procurado)

if indice != -1:
    print(f"O elemento {elemento_procurado} foi encontrado no índice {indice}.")
else:
    print(f"O elemento {elemento_procurado} não foi encontrado na lista.")