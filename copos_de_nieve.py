def max_unique_snowflakes(cases):
    for case in cases:
        n, snowflakes = case
        seen = set()  # Conjunto para mantener los copos únicos en la ventana
        left = 0  # Inicio de la ventana
        max_unique = 0  # Tamaño máximo de la ventana

        for right in range(n):
            while snowflakes[right] in seen:
                # Mover el inicio de la ventana hacia la derecha hasta que no haya duplicados
                seen.remove(snowflakes[left])
                left += 1

            # Agregar el copo de nieve actual al conjunto
            seen.add(snowflakes[right])
            # Actualizar el tamaño máximo de la ventana
            max_unique = max(max_unique, right - left + 1)

        print(max_unique)


# Entrada de prueba
test_cases = [
    (5, [1, 2, 3, 2, 1]),  # Caso de prueba 1
]

# Ejecutar la solución
max_unique_snowflakes(test_cases)
