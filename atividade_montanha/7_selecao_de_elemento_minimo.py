def selecao_elemento_minimo(arr):
    n = len(arr)
    for i in range(n): #MAIOR COMPLEXIDADE
        indice_minimo = i
        for j in range(i + 1, n):
            if arr[j] < arr[indice_minimo]:
                indice_minimo = j

        arr[i], arr[indice_minimo] = arr[indice_minimo], arr[i]

lista_desordenada = [64, 25, 12, 22, 11]
selecao_elemento_minimo(lista_desordenada)
print("Lista ordenada:", lista_desordenada)
