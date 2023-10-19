def merge_sort(arr):
    if len(arr) <= 1:
        return arr

    meio = len(arr) // 2
    metade_esquerda = arr[:meio]
    metade_direita = arr[meio:]

    metade_esquerda = merge_sort(metade_esquerda)
    metade_direita = merge_sort(metade_direita)

    resultado = []
    i = j = 0

    while i < len(metade_esquerda) and j < len(metade_direita): #MAIOR COMPLEXIDADE
        if metade_esquerda[i] < metade_direita[j]:
            resultado.append(metade_esquerda[i])
            i += 1
        else:
            resultado.append(metade_direita[j])
            j += 1

    resultado.extend(metade_esquerda[i:])
    resultado.extend(metade_direita[j:])
    return resultado

lista_desordenada = [38, 27, 43, 3, 9, 82, 10]
lista_ordenada = merge_sort(lista_desordenada)
print("Lista ordenada:", lista_ordenada)
