lista = [6, 5, 3, 4, 1, 2]
print(lista)

for i in range(len(lista) - 1):
    for j in range(len(lista) - 1 - i):
        if lista[j] > lista[j + 1]:
            lista[j], lista[j + 1] = lista[j + 1], lista[j]

print(lista)
