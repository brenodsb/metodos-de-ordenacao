def busca_linear(arr, elemento):
    for i in range(len(arr)): #MAIOR COMPLEXIDADE
        if arr[i] == elemento:
            return i
    return -1

lista = [2, 4, 7, 1, 9, 12, 3]
elemento_procurado = 7
indice = busca_linear(lista, elemento_procurado)

if indice != -1:
    print(f"O elemento {elemento_procurado} foi encontrado no índice {indice}.")
else:
    print(f"O elemento {elemento_procurado} não foi encontrado na lista.")
