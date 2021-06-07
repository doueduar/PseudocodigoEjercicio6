Algoritmo Ejercicio6
	Escribir "total de edades a ingresar"
	Leer total
	Dimension N[total]
	mayor <- 0
	menor <- 0
	CM <- 0
	Cm <- 0
	Escribir "agrege las 100 edades"
	Para i<-1 Hasta total Hacer
		Leer N[i]
		Si 0<N[i] & N[i] < 25 Entonces
			menor = menor+N[i]
			Cm <- Cm +1
		SiNo
			Si 25<=N[i] Entonces
				mayor = mayor+N[i]
				CM = CM+1
			SiNo
				Escribir "NO es permitido este Valor"
			FinSi
		FinSi
	FinPara
	mayor = mayor/CM
	menor = menor/Cm
	Escribir "Promedio de las edades mayores son ",mayor," menores son ",menor
FinAlgoritmo
