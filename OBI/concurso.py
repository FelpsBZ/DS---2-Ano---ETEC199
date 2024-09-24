oi = input()
di = oi.split(" ")

n = di[0]
k = int(di[1])

oii = input()
b = oii.split(" ")
a = []
for i in b:
    a.append(int(i))

k = k -1
#PARA 3 PASSAREM, 3 TEM QUE TER AS MAIORES NOTAS, ENTAO A NOTA DE CORTE VAI SER A MENOR NOTA ENTRE AS 3
a.sort()
a.reverse()
c = a[k]
print(c)

