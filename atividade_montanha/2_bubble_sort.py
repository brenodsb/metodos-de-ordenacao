def bubble_sort(arr):
    n = len(arr)
    for i in range(n): # MAIOR COMPLEXIDADE
        trocas = False

        for j in range(0, n-i-1):
            if arr[j] > arr[j+1]:
                arr[j], arr[j+1] = arr[j+1], arr[j]
                trocas = True

        if not trocas:
            break

lista_desordenada = [64, 34, 25, 12, 22, 11, 90]
bubble_sort(lista_desordenada)
print("Lista ordenada:", lista_desordenada)
