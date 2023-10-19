def fatorial(n):
    if n == 0:
        return 1
    else:
        return n * fatorial(n - 1) #MAIOR COMPLEXIDADE

numero = 5
resultado = fatorial(numero)
print(f"O fatorial de {numero} é {resultado}")