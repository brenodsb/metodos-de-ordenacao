def multiplicacao_matrizes(A, B):
    linhas_A = len(A)
    colunas_A = len(A[0])
    linhas_B = len(B)
    colunas_B = len(B[0])

    if colunas_A != linhas_B:
        raise ValueError("O número de colunas de A deve ser igual ao número de linhas de B.")

    C = [[0 for _ in range(colunas_B)] for _ in range(linhas_A)]

    for i in range(linhas_A): #MAIOR COMPLEXIDADE
        for j in range(colunas_B):
            for k in range(colunas_A):
                C[i][j] += A[i][k] * B[k][j]

    return C

A = [[1, 2], [3, 4]]
B = [[5, 6], [7, 8]]
resultado = multiplicacao_matrizes(A, B)
for linha in resultado:
    print(linha)