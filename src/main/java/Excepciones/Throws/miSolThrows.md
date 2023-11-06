El error de compilacion se produce porque el metodo promedio trows ListaVaciaException y esta no es manejada.
Y como es un tipo de error chequeada que debe ser manejado el programa no compila.
1 alternativa seria hacer que main trohws ListaVaciaExxception y proparagar el error. 
Otra solucion seria borrar el manejo de listaVaciaException en promedio y forzar a que numeros nunca pueda
ser vacia pór ej a traves de un bucle while.