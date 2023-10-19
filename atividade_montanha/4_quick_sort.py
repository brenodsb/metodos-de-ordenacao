def quicksort(arr):
    if len(arr) <= 1:
        return arr

    pivot = arr[len(arr) // 2]
    menores, iguais, maiores = [], [], []

    for elemento in arr:
        if elemento < pivot:
            menores.append(elemento)
        elif elemento == pivot:
            iguais.append(elemento)
        else:
            maiores.append(elemento)

    return quicksort(menores) + iguais + quicksort(maiores) #MAIOR COMPLEXIDADE

lista_desordenada = [3, 6, 8, 10, 1, 2, 1]
lista_ordenada = quicksort(lista_desordenada)
print("Lista ordenada:", lista_ordenada)
